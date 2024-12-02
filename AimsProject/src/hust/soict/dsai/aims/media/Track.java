package hust.soict.dsai.aims.media;

public class Track implements Playable {
    private String title;
    private int length;
    //Getter
    public String getTitle() {
        return title;
    }
    public int getLength(){
        return length;
    }
    //Constructor
    Track(String title, int length){
        this.title = title;
        this.length = length;
    }
    //Method
    public void play()
    {
        System.out.println("Playing track: " + title);
        System.out.println("Length: " + length);
    }
    @Override
    public boolean equals(Object o){
        Track track = (Track) o;
        try{
            String title = track.getTitle();
            int length = track.getLength();
            return title.equals(this.getTitle()) && length == this.getLength();
        } catch (NullPointerException e){
            return false;
        }
    }
}
