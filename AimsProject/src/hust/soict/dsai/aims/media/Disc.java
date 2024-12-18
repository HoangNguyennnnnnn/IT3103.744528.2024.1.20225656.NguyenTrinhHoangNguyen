package hust.soict.dsai.aims.media;

public abstract class Disc extends Media {

    //Attribute
    private int length;
    private String director;

    //Getter
    public int getLength() {
        return length;
    }
    public String getDirector() {
        return director;
    }

    //Setter
    public void setLength(int length) {
        this.length = length;
    }
    public void setDirector(String director) {
        this.director = director;
    }

    //Constructor
    public Disc(String title, String category, float cost, int length, String director) {
        super(title,category,cost);
        this.length = length;
        this.director = director;
    }
    public Disc(String title, String category, float cost, String director) {
        super(title, category, cost);
        this.director = director;
    }
    public Disc(String title) {
        super(title);
    }
    public Disc(String title, String category, float cost) {
        super(title,category,cost);
    }
}
