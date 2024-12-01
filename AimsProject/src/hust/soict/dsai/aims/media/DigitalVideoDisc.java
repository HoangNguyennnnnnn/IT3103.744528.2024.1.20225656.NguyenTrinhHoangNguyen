package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{
    // Attribute
    private static int nbDigitalVideoDiscs = 0;
    private String director;
    private int length;
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
        this.director = director;
        this.setCost(cost);
        this.setId(nbDigitalVideoDiscs++);
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.setTitle(title);
        this.setCategory(category);
        this.director = director;
        this.length = length;
        this.setCost(cost);
        this.setId(nbDigitalVideoDiscs++);
    }
        // Getter
    public String getDirector() {
        return director;
    }
    public int getLength() {
        return length;
    }

    //Setter

    //Method
    public String toString()
    {
        return "DVD - " + getTitle() + " - " + getCategory() + " - " + director + " - " + length + ": " + getCost() +" $ ";
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
