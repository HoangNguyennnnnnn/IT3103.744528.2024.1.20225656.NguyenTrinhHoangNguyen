package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    // Attribute
    public static final int MAX_NUMBERS_ORDERED = 20;
    private List<Media> itemsOrdered = new ArrayList<Media>();
    // Method to add Media to the cart
    public void addMedia(Media media) {
        if(itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
            itemsOrdered.add(media);
            System.out.println("Added media: " + media);
        }else
        {
            System.out.println("The cart is full. Can't add more media");
        }
    }
    // Method to delete Media in the cart
    public void removeMedia(Media media) {
        //Search for media
        for(Media item: itemsOrdered) {
            if(item.equals(media)) {
                itemsOrdered.remove(media);
                System.out.println("Removed media: " + media);
                return;
            }
        }
        System.out.println("Not found media: "+ media.toString()+". Can't remove media");

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
    public void searchByID(int id)
    {
        boolean found = false;
        for(Media item : itemsOrdered){
            if(item.getId() == id)
            {
                found = true;
                System.out.println("DVD founded: " + item.toString());
            }
        }
        if(!found)
        {
            System.out.println("DVD not found");
        }
    }
    //Search DVD in Cart by Title
    public void searchByTitle(String title)
    {
        for(Media item : itemsOrdered){
            if(item.isMatch(title))
            {
                System.out.println("DVD founded: " + item.toString());
                return;
            }
        }
        System.out.println("DVD not found");
    }
}

