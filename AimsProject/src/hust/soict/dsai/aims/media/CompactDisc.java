package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable{

    //Attribute
    private String artist;
    private List<Track> tracks = new ArrayList<>();

    //Getter
    public String getArtist() {
        return artist;
    }

    //Constructor
    public CompactDisc(String title,String category,float cost,int length,String director,
                       String artist) {
        super(title,category,cost,length,director);
        this.artist = artist;
    }
    //addTrack
    public void addTrack(Track track) {
        int index = tracks.indexOf(track);
        if(index == -1) {
            System.out.println("Track is already in the list");
            return;
        }
        tracks.add(track);
        System.out.println("Track added to the list");
    }
    //Remove Track
    public void removeTrack(Track track) {
        int index = tracks.indexOf(track);
        if(index == -1) {
            System.out.println("Track is not in the list");
            return;
        }
        tracks.remove(index);
        System.out.println("Track removed from the list");
    }
    //Get track length
    public int getLength() {
        int length = 0;
        for(Track track : tracks) {
            length += track.getLength();
        }
        setLength(length);
        return length;
    }
    //Play
    public void play()
    {
        System.out.println("Playing CD: " + this.getTitle());
        System.out.println("Artist: " + this.getArtist());
        System.out.println("Length: " + this.getLength());
        for(Track track : tracks) {
            track.play();
        }
    }
}
