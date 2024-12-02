package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{
    // Attribute
    private static int nbDigitalVideoDiscs = 0;
    // Constructor
    public DigitalVideoDisc(String title) {
        this.setTitle(title);
        this.setId(nbDigitalVideoDiscs++);
    }
    public DigitalVideoDisc(String title, String category, float cost) {
        this.setTitle(title);
        this.setCategory(category);
        this.setCost(cost);
        this.setId(nbDigitalVideoDiscs++);
    }
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.setTitle(title);
        this.setCategory(category);
        this.setDirector(director);
        this.setCost(cost);
        this.setId(nbDigitalVideoDiscs++);
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.setTitle(title);
        this.setCategory(category);
        this.setDirector(director);
        this.setLength(length);
        this.setCost(cost);
        this.setId(nbDigitalVideoDiscs++);
    }
    // Getter
    //Setter
    //Method
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
