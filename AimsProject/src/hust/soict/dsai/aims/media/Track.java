package hust.soict.dsai.aims.media;

import hust.soict.dsai.aims.exception.PlayerException;

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
    public Track(int length,String title){
        this.title = title;
        this.length = length;
    }
    //Method
    public void play() throws PlayerException {
        try {
            System.out.println("Playing track: " + title);
            System.out.println("Length: " + length);

            // Giả sử có thể có một số điều kiện lỗi nào đó
            if (this.length <= 0) {
                throw new PlayerException("Track length is invalid.");
            }

        } catch (Exception e) {
            // Ném ngoại lệ PlayerException khi có lỗi trong quá trình phát
            throw new PlayerException("Error while trying to play the track: " + e.getMessage(), e);
        }
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
