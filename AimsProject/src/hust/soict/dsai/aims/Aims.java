package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args)
    {

        //Create a new cart
        Cart anOrder = new Cart();
            //Print products when cart is empty
            System.out.println("1,Print products when cart is empty");
            anOrder.print();

            //Create new DVD objects and add them to the cart
            System.out.println("2,Create new DVD objects and add them to the cart");
            DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
            anOrder.addMedia(dvd1);

            DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
            anOrder.addMedia(dvd2);

            DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
            anOrder.addMedia(dvd3);
            //Print list items in the cart
            System.out.println("3,Print list items in the cart");
            anOrder.print();

            //Print total cost of the items in the cart
            System.out.println("4,Total Cost is:");
            System.out.println(anOrder.totalCost());

            //Remove DVD objects form the cart
            System.out.println("5,Remove DVD objects form the cart");
            anOrder.removeMedia(dvd2);

            //print list items in the cart
            System.out.println("6,Print list items in the cart");
            anOrder.print();

            //print total cost of the items in the cart
            System.out.println("7,Total Cost is:");
            System.out.println(anOrder.totalCost());

            //Delete DVD when it is not in the cart
            System.out.println("8,Delete DVD when it is not in the cart");
            anOrder.removeMedia(dvd2);

            //Delete DVD when cart is empty
            System.out.println("9,Delete DVD when cart is empty");
            anOrder.removeMedia(dvd1);
            anOrder.removeMedia(dvd3);
            anOrder.removeMedia(dvd3);

            //Add products when cart is almost full
            System.out.println("10,Add products when cart is almost full");
            for(int i = 0;i<21;i++)
            {
                anOrder.addMedia(dvd2);
            }
    }
}
