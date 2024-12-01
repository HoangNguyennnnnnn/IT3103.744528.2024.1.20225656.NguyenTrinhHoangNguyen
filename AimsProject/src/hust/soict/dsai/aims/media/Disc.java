package hust.soict.dsai.aims.media;

public class Disc extends Media {

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
    public Disc(int length, String director, String id, float title, int category, String cost) {
        super(id,title,category,cost);
        this.length = length;
        this.director = director;
    }
    public Disc() {
    }
}
