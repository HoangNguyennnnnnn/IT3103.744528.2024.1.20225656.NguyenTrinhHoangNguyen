package hust.soict.dsai.aims.media;

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
    public void play()
    {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD Length: " + this.getLength());
    }

    public String getDetails() {
        return ("Product ID: " + String.valueOf(this.getId())
                + "\n" + "\t" + "Title: " + this.getTitle()
                + "\n" + "\t" + "Category: " + this.getCategory()
                + "\n" + "\t" + "Director: " + this.getDirector()
                + "\n" + "\t" + "Length: " + String.valueOf(this.getLength()) + " minutes"
                + "\n" + "\t" + "Price: $" + String.valueOf(this.getCost()));
    }
}
