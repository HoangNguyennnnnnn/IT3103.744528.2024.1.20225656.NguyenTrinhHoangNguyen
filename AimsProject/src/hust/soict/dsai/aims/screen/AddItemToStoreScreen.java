package hust.soict.dsai.aims.screen;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.store.Store;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

public class AddItemToStoreScreen extends JFrame {
    private Store store;
    private Cart cart;

    public AddItemToStoreScreen(Store store, Cart cart) {
        super();
        this.store = store;
        this.cart = cart;
        this.setSize(1024,768);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                new StoreScreen(store, cart);
            }
        });
    }
}
