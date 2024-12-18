package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.exception.DupplicatedItemException;
import hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;
import java.util.List;

public class Store {
    //Attribute
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();
    //Add DVD to Store
    public void addMedia(Media media) throws DupplicatedItemException {
        if (media != null) {
            for (Media m : itemsInStore) {
                if (media.equals(m)) {
                    // Nếu media đã có trong store, ném ngoại lệ DupplicatedItemException
                    throw new DupplicatedItemException("Media " + media.getTitle() + " is already in the store.");
                }
            }
            itemsInStore.add(media);
            System.out.println("Added media: " + media);
        }
    }

    //Remove DVD in Store
    public void removeMedia(Media media) {
        for(Media item: itemsInStore) {
            if(item.equals(media)) {
                itemsInStore.remove(media);
                System.out.println("Removed media: " + media);
                return;
            }
        }
        System.out.println("Not found media: "+ media.toString()+". Can't remove media");
    }

    //Print list DVD in Store
    public void print(){
        for (Media item : itemsInStore) {
            System.out.println(item.toString());
        }
    }

    //Search Media in Store by Title
    public Media SearchByTitle(String title) {
        if(title != null &&!title.trim().isEmpty()) {
            title = title.trim();
            for(Media item: itemsInStore) {
                if(item.getTitle().equalsIgnoreCase(title)) {
                    return item;
                }
            }
        }
        return null;
    }
    //Search Media in Store by ID
    public Media SearchById(int id) {
            for(Media item: itemsInStore) {
                if(item.getId() == id) {
                    return item;
                }
            }
        return null;
    }
    //Getter and Setter
    public ArrayList<Media> getItemsInStore() {
        return itemsInStore;
    }

    public void setItemsInStore(ArrayList<Media> itemsInStore) {
        this.itemsInStore = itemsInStore;
    }
}
