import java.util.ArrayList;

public class User {
    private String usernamer;
    private String email;
    private ArrayList<Media> purchaseMediaList = new ArrayList<>();
    private ArrayList<Media> shoppingCart = new ArrayList<>();

    public User(String usernamer, String email, ArrayList<Media> purchaseMediaList, ArrayList<Media> shoppingCart) {
        this.usernamer = usernamer;
        this.email = email;
        this.purchaseMediaList = purchaseMediaList;
        this.shoppingCart = shoppingCart;
    }

    public String getUsernamer() {

        return usernamer;
    }

    public void setUsernamer(String usernamer) {

        this.usernamer = usernamer;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Media> getPurchaseMediaList() {

        return purchaseMediaList;
    }

    public void setPurchaseMediaList(ArrayList<Media> purchaseMediaList) {

        this.purchaseMediaList = purchaseMediaList;
    }

    public ArrayList<Media> getShoppingCart() {

        return shoppingCart;
    }

    public void setShoppingCart(ArrayList<Media> shoppingCart) {

        this.shoppingCart = shoppingCart;
    }


    public void addToCart(Media media) {

        shoppingCart.add(media);
    }

    public void removeFromCart(Media media) {
        shoppingCart.remove(media);

    }

    public void checkout() {

        for (int i = 0; i < shoppingCart.size(); i++) {

            getPurchaseMediaList().add(shoppingCart.get(i));

            shoppingCart.remove(getPurchaseMediaList().get(i));


        }

    }

    @Override
    public String toString() {
        return "User{" +
                "usernamer='" + usernamer + '\'' +
                ", email='" + email + '\'' +
                ", purchaseMediaList=" + purchaseMediaList +
                ", shoppingCart=" + shoppingCart +
                '}' + super.toString();
    }
}

