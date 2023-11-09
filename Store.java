import java.util.ArrayList;

public class Store {

    private ArrayList<User> users = new ArrayList<>();
    private ArrayList<Media> media = new ArrayList<>();

    public Store(ArrayList<User> users, ArrayList<Media> media) {
        this.users = users;
        this.media = media;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<Media> getMedia() {
        return media;
    }

    public void setMedia(ArrayList<Media> media) {
        this.media = media;
    }

    public void addUser(User user) {
        users.add(user);

    }

    public ArrayList<User> displayUsers() {
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.toString());
        }
        return users;

    }

    public void addMedia(Media m) {
        media.add(m);

    }

    public ArrayList<Media> displayMedia() {
        for (int i = 0; i < media.size(); i++) {

            System.out.println(media.toString());
        }
        return media;

    }

    public Book searchBook(String title) {

        for (Media Book : media) {
            if (Book.getTitle().equals(title))
                return (Book) Book;
        }
return null;
    }

    @Override
    public String toString() {
        return "Store{" +
                "users=" + users +
                ", media=" + media +
                '}' + super.toString();
    }
}

