package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{
    // Constructor
    public DigitalVideoDisc(String title) {
        this.setTitle(title);
    }
    public DigitalVideoDisc(String title, String category, float cost) {
        this.setTitle(title);
        this.setCategory(category);
        this.setCost(cost);
    }
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.setTitle(title);
        this.setCategory(category);
        this.setDirector(director);
        this.setCost(cost);
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
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
        return "DVD - " + getTitle() + " - " + getCategory() + " - " + getDirector() + " - " + getLength() + ": " + getCost() +" $ ";
    }
    public boolean isMatch(String title)
    {
        return this.getTitle().equals(title);
    }
    //Play
    public void play()
    {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD Length: " + this.getLength());
    }
}
