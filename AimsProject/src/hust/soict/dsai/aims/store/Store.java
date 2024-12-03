package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;
import java.util.List;

public class Store {
    //Attribute
    private List<Media> itemsInStore = new ArrayList<Media>();
    //Add DVD to Store
    public void addMedia(Media media) {
        if(media != null) {
            for(Media m : itemsInStore) {
                if(media.equals(m)) {
                    System.out.println("Media is already in the store");
                    return;
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
}
