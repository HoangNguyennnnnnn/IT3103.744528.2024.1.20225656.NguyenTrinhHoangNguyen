package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;
import java.util.List;

public class Store {
    //Attribute
    private List<Media> itemsInStore = new ArrayList<Media>();
    //Add DVD to Store
    public void addMedia(Media media) {
        itemsInStore.add(media);
        System.out.println("Added media: " + media);
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
}
