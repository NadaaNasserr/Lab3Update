import java.util.ArrayList;
import java.util.Stack;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Media m1 =new Media();




        Movie movie1 = new Movie("Blacklist", "auteur1" , "123" , 55.5,100 );
        Movie movie2 = new Movie("one piece", "Eiichirō Oda" , "22" , 88.2,150 );


        System.out.println( movie1.getMediaType());

        ArrayList<Movie> movieArrayList = new ArrayList<>();
        movieArrayList.add(movie1);
        movieArrayList.add(movie2);

        System.out.println(movieArrayList.toString() + "    ");
        System.out.println();
       movie1.recommendSimilarMovies(movieArrayList);





        Review r1 = new Review("x1" , 1 , "enjoyable book");
        Review r2 = new Review("x4" , 3 , "I will read watch the book again");

        ArrayList<Review> arrayR = new ArrayList<Review>();
        arrayR.add(r1);
        arrayR.add(r2);

        Book book1 = new Book("Data Since" , "Ahmed" ,"2201" , 12,7 , arrayR);
        Book book2 = new Book("Computer Science" , "Omar" ,"1102" , 15,0 , arrayR);

        book2.restock(5);
        System.out.println(book2.getStock());


       book1.addReviews(r2);
       // System.out.println(book2.getReviews());
      //  book1.getAverageRating();
      //  System.out.println(book1.isBestseller());

        Music music1 = new Music("Music1" ,"khlaed","3321",44.3,"khlaed" );
        Music music2 = new Music("Music2" ,"Moath","8812",4,"Moath" );
        Music music3 = new Music("Music2" ,"Moath","8812",4,"Moath" );

        ArrayList<Music>  arrayListMusic = new ArrayList<>();
        arrayListMusic.add(music1);
        arrayListMusic.add(music2);
        arrayListMusic.add(music3);
          System.out.println( music1.generatePlaylist(arrayListMusic));
        System.out.println(arrayListMusic.toString());




        System.out.println(music1.getMediaType());
        System.out.println(music2.getMediaType());


        AcademicBook academicBook1 = new AcademicBook("Data Since" , "Ahmed" ,"2201" , 12,4 , arrayR,"Data Since");
        System.out.println(academicBook1.getMediaType());

         Novel novel = new Novel("Data Since" , "Ahmed" ,"2201" , 12,4 , arrayR,"disney");
        System.out.println(novel.getAverageRating());
        System.out.println(novel.toString());


        ArrayList<Media> purchaseMediaList = new ArrayList<>();
        ArrayList<Media> shoppingCart = new ArrayList<>();

        User user1 = new User("nada12" , "na@gmail.com" ,purchaseMediaList,shoppingCart );
        User user2 = new User("sarah99" , "sa@gmail.com" ,purchaseMediaList,shoppingCart );

        ArrayList<User> arrayListUser = new ArrayList<>();
        ArrayList<Media> arrayListMedia = new ArrayList<>();
        arrayListUser.add(user1);
        arrayListUser.add(user2);
        arrayListMedia.add(book1);
        System.out.println(arrayListUser.toString());
        System.out.println("--");
        System.out.println("--");
        movie1.watch(user1);
        System.out.println("--");
        System.out.println("--");

        book1.purchase(user1);

        Store store1 = new Store(arrayListUser, arrayListMedia);

        user1.addToCart(book1);
        user1.addToCart(movie1);
        System.out.println("--");
       user1.removeFromCart(book1);
        System.out.println("--");
        store1.addUser(user1);
        store1.displayMedia();
        store1.displayUsers();
        System.out.println("--");
        user1.addToCart(movie1);
        store1.displayUsers();
        user1.addToCart(novel);
        System.out.println("--");

        System.out.println(store1.searchBook("Data Since"));
        System.out.println(store1.searchBook("IT"));

        System.out.println(novel.getMediaType());
        System.out.println(novel.toString());
        store1.addMedia(movie2);
        store1.addMedia(movie1);
        store1.addMedia(book1);
        store1.addMedia(music1);
        store1.displayMedia();
        movie1.watch(user1);

        user1.addToCart(novel);
        System.out.println(user1.getPurchaseMediaList());
        System.out.println(user1.getShoppingCart());

        user1.checkout();
        System.out.println(user1.getShoppingCart());

    }
}