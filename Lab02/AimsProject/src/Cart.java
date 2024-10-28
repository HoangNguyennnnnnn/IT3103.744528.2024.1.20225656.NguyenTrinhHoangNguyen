public class Cart {
    // Attribute
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc []itemsOrdered =
            new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    // Method to add a new DVD
    public void addDigitalVideoDisc(DigitalVideoDisc disc)
    {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc "+ disc.getTitle() +" has been added");
        }
        else {
            System.out.println("The cart is full. Can't add "+disc.getTitle());
        }
    }
    // Method to remove the item passed by argument from the list
    public void RemoveDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered == 0) {
            System.out.println("Cart is empty. Can't remove "+disc.getTitle());
            return;
        }
        for (int i = 0; i < qtyOrdered && itemsOrdered[i] != null; i++) {
            if (itemsOrdered[i].equals(disc)) {
                for (int j = i; j < qtyOrdered-1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[qtyOrdered-1] = null;
                System.out.println("The disc " +disc.getTitle() +" has been removed");
                qtyOrdered--;
                return;
            }
        }
        System.out.println("Cart does not contain DVDs "+disc.getTitle());
    }
    // Method to calculate the total cost
    public float totalCost(){
        if (qtyOrdered == 0) {
            return 0;
        }
        float total = 0;
        for (int i = 0; i < qtyOrdered && itemsOrdered[i] != null; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }
    //Print list DVDs in cart
    public void printList(){
        System.out.println("Your cart:");
        if(qtyOrdered == 0){
            System.out.println("Cart is empty");
            return;
        }else
        {
            for(int i=0;i<qtyOrdered;i++){
                System.out.println((i+1)+":" + itemsOrdered[i].getTitle()+ "-" +
                        itemsOrdered[i].getCategory() +"-"+itemsOrdered[i].getDirector()+"-"+
                        itemsOrdered[i].getLength()+"-"+itemsOrdered[i].getCost());
            }
        }
    }

}
