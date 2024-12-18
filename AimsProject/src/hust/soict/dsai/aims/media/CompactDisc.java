package hust.soict.dsai.aims.media;

import hust.soict.dsai.aims.exception.DupplicatedItemException;
import hust.soict.dsai.aims.exception.PlayerException;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable{

    //Attribute
    private String artist;
    private List<Track> tracks = new ArrayList<Track>();

    //Getter
    public String getArtist() {
        return artist;
    }

    public List<Track> getTracks() {
        return tracks;
    }

    //Constructor
    public CompactDisc(String title, String category, float cost, String director,
                       String artist) {
        super(title,category,cost,director);
        this.artist = artist;
    }
    public CompactDisc(String title,String category,float cost,int length,String director,
                       String artist, List<Track> tracks) {
        super(title,category,cost,length,director);
        this.artist = artist;
        this.tracks = tracks;
    }

    //toString
    @Override
    public String toString()
    {
        return "CD - " + getId() +". "+getTitle() + " - " + "category: "+getCategory() + " - " +"director: "+ getDirector()+" - " +
                "artist: "+artist
                +" - " + "length: "+getLength() + " - cost: " + getCost() +" $ ";
    }
    //addTrack
    public void addTrack(Track track) throws DupplicatedItemException {
        int index = tracks.indexOf(track);
        if (index != -1) { // Nếu track đã tồn tại trong danh sách
            throw new DupplicatedItemException("Track is already in the list");
        }
        tracks.add(track); // Nếu track chưa tồn tại, thêm vào danh sách
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
    public void play() throws PlayerException {
        if (this.getLength() <= 0) {
            throw new PlayerException("ERROR: CD length is non-positive!");
        } else {
            System.out.println("Playing CD: " + this.getTitle());
            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
            JPanel p = new JPanel();
            JDialog d = new JDialog();
            JLabel l1 = new JLabel("Now playing: " + this.getTitle());
            p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
            l1.setAlignmentX(Component.CENTER_ALIGNMENT);
            d.setTitle("Media Player");
            p.add(Box.createVerticalGlue());
            p.add(l1);
            p.add(Box.createVerticalGlue());
            d.add(p);
            d.setSize(250,100);
            int w = d.getSize().width;
            int h = d.getSize().height;
            int x = (dim.width - w) / 2;
            int y = (dim.height - h) / 2;
            d.setLocation(x, y);
            d.setVisible(true);
            for (Track track: this.tracks) {
                try {
                    track.play();
                } catch (PlayerException e) {
                    throw e;
                }
            }
        }
    }



}
