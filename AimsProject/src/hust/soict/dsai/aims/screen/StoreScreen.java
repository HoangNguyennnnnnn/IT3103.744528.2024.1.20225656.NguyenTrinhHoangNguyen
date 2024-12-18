package hust.soict.dsai.aims.screen;

import hust.soict.dsai.aims.screen.*;
import hust.soict.dsai.aims.store.*;
import hust.soict.dsai.aims.cart.*;
import hust.soict.dsai.aims.exception.*;
import hust.soict.dsai.aims.media.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class StoreScreen extends JFrame {
    private Store store;
    private Cart cart;

    public StoreScreen(Store store, Cart cart) {
        this.store = store;
        this.cart = cart;
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(createNorth(), BorderLayout.NORTH);
        cp.add(createCenter(), BorderLayout.CENTER);
        setVisible(true);
        setTitle("Store");
        setSize(1024, 768);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int w = getSize().width;
        int h = getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;
        setLocation(x, y);
    }

    JPanel createNorth() {
        JPanel north = new JPanel();
        north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
        north.add(createMenuBar());
        north.add(createHeader());
        return north;
    }

    JPanel createCenter() {
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(5, 5, 2, 2));
        ArrayList<Media> mediaInStore = store.getItemsInStore();
        for (Media media : mediaInStore) {
            MediaStore cell = new MediaStore(media, cart);
            center.add(cell);
        }
        return center;
    }

    JMenuBar createMenuBar() {
        JMenu menu = new JMenu("Options");

        JMenu smUpdateStore = new JMenu("Update Store");
        JMenuItem addBook = new JMenuItem("Add Book");
        addBook.addActionListener(new AddBookListener());
        smUpdateStore.add(addBook);
        JMenuItem addCD = new JMenuItem("Add CD");
        addCD.addActionListener(new AddCDListener());
        smUpdateStore.add(addCD);
        JMenuItem addDVD = new JMenuItem("Add DVD");
        addDVD.addActionListener(new AddDVDListener());
        smUpdateStore.add(addDVD);

        menu.add(smUpdateStore);
        menu.add(new JMenuItem("View store"));
        JMenuItem cart = new JMenuItem("View cart");
        cart.addActionListener(new ViewCartListener());
        menu.add(cart);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
        menuBar.add(menu);

        return menuBar;
    }

    JPanel createHeader() {
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));

        JLabel title = new JLabel("AIMS:Nguyen Trinh Hoang Nguyen 20225656");
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
        title.setForeground(Color.CYAN);

        JButton cart = new JButton("View cart");
        cart.setPreferredSize(new Dimension(100, 50));
        cart.setMaximumSize(new Dimension(100, 50));
        cart.addActionListener(new ViewCartListener());

        header.add(Box.createRigidArea(new Dimension(10, 10)));
        header.add(title);
        header.add(Box.createHorizontalGlue());
        header.add(cart);
        header.add(Box.createRigidArea(new Dimension(10, 10)));

        return header;
    }

    private class ViewCartListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            new CartScreen(store, cart);
            dispose();
        }

    }

    private class AddDVDListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            new AddDVDToStoreScreen(store, cart);
            dispose();
        }

    }

    private class AddBookListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            new AddBookToStoreScreen(store, cart);
            dispose();
        }

    }

    private class AddCDListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            new AddCDToStoreScreen(store, cart);
            dispose();
        }

    }

}