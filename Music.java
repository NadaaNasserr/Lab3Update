import java.util.ArrayList;

public class Music extends Media{

    private String artist;


    public Music(String artist) {
        this.artist = artist;
    }

    public Music(String title, String auteur, String ISBN, double price, String artist) {
        super(title, auteur, ISBN, price);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void listen(User user){



  }
  public ArrayList<Music> generatePlaylist(ArrayList<Music> music) {
      ArrayList<Music> musicArray = new ArrayList<>();

      for (int i = 0; i < music.size(); i++) {

          if (music.get(i).equals(artist)) {

              musicArray.add(music.get(i));
          }
      }
      return musicArray;
  }

  public String getMediaType(){

    if(getPrice() >= 10)
        return "Premium Music";
    else
      return "Music";
  }


    @Override
    public String toString() {
        return "Music{" +
                "artist='" + artist + '\'' +
                '}' + super.toString();
    }
}
