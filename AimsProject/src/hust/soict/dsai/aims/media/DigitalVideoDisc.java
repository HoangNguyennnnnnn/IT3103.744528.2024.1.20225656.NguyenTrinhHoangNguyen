package hust.soict.dsai.aims.media;

import hust.soict.dsai.aims.exception.PlayerException;

public class DigitalVideoDisc extends Disc implements Playable{
    // Constructor
    public DigitalVideoDisc(String title) {
        super(title);
    }
    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
        this.setTitle(title);
        this.setCategory(category);
        this.setCost(cost);
    }
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super(title, category, cost, director);
        this.setTitle(title);
        this.setCategory(category);
        this.setDirector(director);
        this.setCost(cost);
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, cost, director);
        this.setTitle(title);
        this.setCategory(category);
        this.setDirector(director);
        this.setLength(length);
        this.setCost(cost);
    }
    // Getter
    //Setter
    //Method
    @Override
    public String toString()
    {
        return "DVD - "+getId()+". " + getTitle() + " - " + "category: "+getCategory() + " - "
                +"director: "+getDirector() + " - " +"length: "+ getLength() + ": " +"cost: "+ getCost() +" $ ";
    }

    public boolean isMatch(String title)
    {
        return this.getTitle().equals(title);
    }
    //Play
    public void play() throws PlayerException
    {
        if(this.getLength()>0) {
            System.out.println("Playing DVD: " + this.getTitle());
            System.out.println("DVD Length: " + this.getLength());
        }else{
            throw new PlayerException("DVD Length is zero");
        }
    }
}
