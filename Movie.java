import java.util.ArrayList;

public class Movie extends Media {

    private int duration;


    public Movie(int duration) {
        this.duration = duration;
    }

    public Movie(String title, String auteur, String ISBN, double price, int duration) {
        super(title, auteur, ISBN, price);
        this.duration = duration;
    }

    public int getDuration() {

        return duration;
    }

    public void setDuration(int duration) {

        this.duration = duration;
    }

    public void watch(User user) {

        user.getPurchaseMediaList().add(this);

    }

    public ArrayList<Movie> recommendSimilarMovies(ArrayList<Movie> movieCatalog) {

        ArrayList<Movie> array1 = new ArrayList<>();

        for (int i = 0; i < movieCatalog.size(); i++) {

            if (movieCatalog.get(i).equals(getAuteur())) {

             array1.add(movieCatalog.get(i));
            }
            }
        return array1;

    }

    public String getMediaType() {
        if (getDuration() >= 120){
            return
                    "Long Movie";}
        else return
                "Movie";
    }


    @Override
    public String toString() {
        return "Movie{" +
                "duration=" + duration +
                '}' + super.toString();
    }
}

