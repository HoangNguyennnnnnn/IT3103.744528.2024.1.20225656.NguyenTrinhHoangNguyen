package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
    //Attribute
    DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[1000000];
    int numberOfItemsInStore = 0;
    //Add DVD to Store
    public void addDVD(DigitalVideoDisc dvd){
        if (numberOfItemsInStore < itemsInStore.length){
            itemsInStore[numberOfItemsInStore] = dvd;
            numberOfItemsInStore++;
            System.out.println("Added DVD: " + dvd.getTitle());
        }
        else {
            System.out.println("Store is full");
        }
    }
    //Remove DVD in Store
    public void removeDVD(DigitalVideoDisc dvd){
        boolean removed = false;
        for (int i = 0; i < numberOfItemsInStore; i++){
            if (itemsInStore[i].equals(dvd)){
                removed = true;
                for(int j = i; j < numberOfItemsInStore-1; j++){
                    itemsInStore[j] = itemsInStore[j+1];
                }
                numberOfItemsInStore--;
                System.out.println("Removed DVD: " + dvd.getTitle());
                break;
            }
        }
        if (!removed){
            System.out.println("DVD not found!");
        }
    }

    //Print list DVD in Store
    public void printListDVD(){
        for (int i = 0; i < numberOfItemsInStore; i++){
            System.out.println("DVD: " + itemsInStore[i].toString());
        }
    }
}
