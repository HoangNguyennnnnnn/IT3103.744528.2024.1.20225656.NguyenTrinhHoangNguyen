package hust.soict.dsai.aims.screen;

import javax.swing.JFrame;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.exception.NonExistingItemException;
import hust.soict.dsai.aims.exception.PlayerException;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;
import hust.soict.dsai.aims.store.Store;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;;


public class CartScreenController {

    private Store store;
    private Cart cart;
    private JFrame stage;
    private FilteredList<Media> filteredCart;
    private boolean filterByID = true;

    @FXML
    private Label totalCost;

    @FXML
    private ToggleGroup filterCategory;

    @FXML
    private Button btnPlay;

    @FXML
    private Button btnRemove;

    @FXML
    private TextField tfFilter;

    @FXML
    private RadioButton radioBtnFilterId;

    @FXML
    private RadioButton radioBtnFilterTitle;

    @FXML
    private TableView<Media> tblMedia;

    @FXML
    private TableColumn<Media, String> colMediaTitle;

    @FXML
    private TableColumn<Media, String> colMediacategory;

    @FXML
    private TableColumn<Media, Float> colMediaCost;

    public CartScreenController(Store store, Cart cart, JFrame stage) {
        super();
        this.cart = cart;
        this.store = store;
        this.stage = stage;
    }

    @FXML
    private void initialize() {
        filteredCart = new FilteredList<Media>(this.cart.getItemsOrdered(), s -> true);

        colMediaTitle.setCellValueFactory(
                new PropertyValueFactory<Media, String>("Title"));
        colMediacategory.setCellValueFactory(
                new PropertyValueFactory<Media, String>("Category"));
        colMediaCost.setCellValueFactory(
                new PropertyValueFactory<Media, Float>("Cost"));
        tblMedia.setItems(this.cart.getItemsOrdered());

        btnPlay.setVisible(false);
        btnRemove.setVisible(false);

        totalCost.setText(String.valueOf(this.cart.totalCost()));

        tblMedia.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Media>() {

                @Override
                public void changed(ObservableValue<? extends Media> observable, Media oldValue, Media newValue) {
                    if (newValue != null) {
                        updateButtonBar(newValue);
                    }
                }
            }
        );

        tfFilter.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                showFilteredMedia(newValue);
            }
        });
    }

    @FXML
    private void btnRemovePressed(ActionEvent event) throws NonExistingItemException {
        // Lấy đối tượng media được chọn
        Media media = tblMedia.getSelectionModel().getSelectedItem();

        // Kiểm tra xem có item nào được chọn hay không
        if (media == null) {
            // Nếu không có item nào được chọn, hiển thị thông báo lỗi
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Selection Error");
            alert.setHeaderText("No item selected");
            alert.setContentText("Please select an item to remove.");
            alert.showAndWait();
            return; // Dừng phương thức nếu không có item được chọn
        }

        // Thử xóa media khỏi giỏ hàng
        try {
            cart.removeMedia(media);
            // Cập nhật lại tổng chi phí sau khi xóa
            totalCost.setText(String.valueOf(this.cart.totalCost()));
            // Hiển thị thông báo thành công
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Success");
            alert.setHeaderText("Item Removed");
            alert.setContentText(media.getTitle() + " has been removed from the cart.");
            alert.showAndWait();
        } catch (NonExistingItemException e) {
            // Nếu media không tồn tại trong giỏ hàng, ném ngoại lệ
            throw new NonExistingItemException("Item does not exist in the cart.");
        }
    }


    @FXML
    private void setFilterByID() {
        this.filterByID = true;
    }

    @FXML
    private void setFilterByTitle() {
        this.filterByID = false;
    }

    void updateButtonBar(Media media) {
        if (media == null) {
            btnPlay.setVisible(false);
            btnRemove.setVisible(false);
        } else {
            btnRemove.setVisible(true);
            if (media instanceof Playable) {
                btnPlay.setVisible(true);
            } else {
                btnPlay.setVisible(false);
            }
        }
    }

    private void showFilteredMedia(String filter) {
        if (filter == null || filter.length() == 0) {
            filteredCart.setPredicate(s -> true);
        } else {
            // Nếu bộ lọc là ID, chỉ hiển thị sản phẩm có ID khớp.
            if (filterByID) {
                try {
                    filteredCart.setPredicate(s -> s.getId() == Integer.parseInt(filter));
                } catch (NumberFormatException e) {
                }
            } else //Nếu bộ lọc là tên, hiển thị sản phẩm có tên chứa từ khóa (bỏ qua chữ hoa/chữ thường).
            {
                filteredCart.setPredicate(s -> s.getTitle().toLowerCase().contains(filter));
            }
        }
    }

    @FXML
    private void btnPlayPressed(ActionEvent event) throws PlayerException {
        // Lấy đối tượng media được chọn
        Media media = this.tblMedia.getSelectionModel().getSelectedItem();

        // Kiểm tra xem media có phải là đối tượng Playable không
        if (media instanceof Playable) {
            try {
                // Ép kiểu media thành Playable và gọi phương thức play
                ((Playable) media).play();
            } catch (Exception e) {
                // Xử lý lỗi phát video hoặc âm thanh (nếu có)
                throw new PlayerException("Error while trying to play the media: " + e.getMessage(), e);
            }
        } else {
            // Nếu media không phải là Playable, hiển thị thông báo lỗi
            throw new PlayerException("Selected media is not playable.");
        }
    }


    @FXML
    private void placeOrderPressed(ActionEvent event) {
        // Kiểm tra nếu giỏ hàng trống
        if (cart.getItemsOrdered().isEmpty()) {
            // Hiển thị thông báo lỗi
            Alert emptyCartAlert = new Alert(Alert.AlertType.ERROR);
            emptyCartAlert.setTitle("Empty Cart");
            emptyCartAlert.setHeaderText(null);
            emptyCartAlert.setContentText("Your cart is empty. Please add items before placing an order.");
            emptyCartAlert.showAndWait();
            return;
        }

        // Tính tổng chi phí
        float totalCost1 = cart.totalCost();

        // Hiển thị thông báo thành công
        Alert successAlert = new Alert(Alert.AlertType.INFORMATION);
        successAlert.setTitle("Order Placed");
        successAlert.setHeaderText(null);
        successAlert.setContentText("Your order has been placed successfully!\nTotal cost: " + totalCost1);
        successAlert.showAndWait();
        // Xóa giỏ hàng
        cart.clear();
        totalCost.setText(String.valueOf(this.cart.totalCost()));

    }

    @FXML
    void menuAddBook(ActionEvent event) {
        new AddBookToStoreScreen(store, cart);   // Hiển thị giao diện thêm Book
        stage.hide();
    }

    @FXML
    void menuAddCD(ActionEvent event) {
        new AddCDToStoreScreen(store,cart);
        stage.hide();
    }

    @FXML
    void menuAddDVD(ActionEvent event) {
        new AddDVDToStoreScreen(store,cart);
        stage.hide();
    }

    @FXML
    void viewStore(ActionEvent event) {
        new StoreScreen(store,cart);
        stage.hide();
    }
}

