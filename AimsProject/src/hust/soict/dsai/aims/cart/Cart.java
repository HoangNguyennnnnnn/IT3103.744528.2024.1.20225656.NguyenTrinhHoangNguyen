package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.exception.CartFullException;
import hust.soict.dsai.aims.exception.NonExistingItemException;
import hust.soict.dsai.aims.media.Media;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cart {
    // Attribute
    public static final int MAX_NUMBERS_ORDERED = 20;
    private ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();
    // Method to add Media to the cart
    public void addMedia(Media media) throws CartFullException {
        if (media == null) {
            System.out.println("Media is null. Cannot add to the cart.");
            return;
        }

        if (itemsOrdered.size() >= MAX_NUMBERS_ORDERED) {
            throw new CartFullException("The cart is full. Cannot add more media.");
        }

        if (itemsOrdered.contains(media)) {
            System.out.println("Media is already in the Cart: " + media);
            return;
        }

        itemsOrdered.add(media);
        System.out.println("Added media: " + media);
        System.out.println("Number of media items in the current cart: " + itemsOrdered.size());
    }

    // Method to delete Media in the cart
    public void removeMedia(Media medium) throws NonExistingItemException {
        if (this.itemsOrdered.remove(medium)) {
            System.out.println(medium.getTitle() + " has been removed from the cart.");
        } else {
            throw new NonExistingItemException(medium.getTitle() + " is not in the cart.");
        }
    }
    // Method to calculate the total cost
    public float totalCost(){
        if (itemsOrdered.isEmpty()) {
            return 0;
        }
        float total = 0;
        for(Media item : itemsOrdered){
            total += item.getCost();
        }
        return total;
    }
    //Print Cart
    public void print(){
        System.out.println("******************************CART******************************");
        System.out.println("Ordered Items:");
        for(Media item : itemsOrdered){
            System.out.println(item.getId() + ". "+item.toString());
        }
        System.out.println("Total cost :" + totalCost());
        System.out.println("****************************************************************");
    }

    //Search DVD in Cart by ID
    public Media searchByID(int id)
    {
        for(Media item : itemsOrdered){
            if(item.getId() == id)
            {
                System.out.println("DVD founded: " + item.toString());
                return item;
            }
        }
        System.out.println("DVD not found");
        return null;
    }
    //Search DVD in Cart by Title
    public Media searchByTitle(String title)
    {
        for(Media item : itemsOrdered){
            if(item.isMatch(title))
            {
                System.out.println("DVD founded: " + item.toString());
                return item;
            }
        }
        System.out.println("DVD not found");
        return null;
    }
    //Sort list media in Cart by Title -> Cost
    public void sortTitleCost()
    {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
        System.out.println("Cart sorted by title.");
        print();
    }
    //Sort list media in Cart by Cost -> Title
    public void sortCostTitle()
    {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
        System.out.println("Cart sorted by cost.");
        print();
    }
    //Clear cart
    public void clear()
    {
        itemsOrdered.clear();
    }
    //Getter
    public ObservableList<Media> getItemsOrdered() {
        return itemsOrdered;
    }
}

