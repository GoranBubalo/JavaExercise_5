
import java.util.ArrayList;

public class Book {
    /*
     * Write a Java program to create a class called
     * "Book" with attributes for title, author, and ISBN,
     * and methods to add and remove books from a collection.
     * */

    private String title = "";
    private  String author = "";
    private int  ISBN ;
    //Collection of Books, we will use a Arraylist because it stores reference data types
    private static ArrayList < Book > bookCollection = new ArrayList<Book>();

    //Constructor with attributes
   public Book(String title,String author, int ISBN){
        this.title = title;
        this.author=author;
        this.ISBN = ISBN;
    }

    //Getters
    public String getTitle(){
       return  this.title;
    }
    public String getAuthor(){
        return  this.author;
    }
    public int getISBN(){
        return  this.ISBN;
    }

    //Setters

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
}
