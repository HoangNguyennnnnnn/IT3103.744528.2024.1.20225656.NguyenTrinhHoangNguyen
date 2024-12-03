package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {

    //Attribute
    private List<String> authors = new ArrayList<String>();

    //Constructor
    public Book(String title, String category, float cost) {
        super(title, category, cost);
    }
    @Override
    //toString
    public String toString()
    {
        return "BOOK - " +getId() +". "+ getTitle() + " - " + getCategory() + " - "+ authors +": " + getCost() +" $ ";
    }

    //Add Authors
    public void addAuthor(String authorName) {
        if(!authors.contains(authorName)){
            authors.add(authorName);
            System.out.println("Author added: " + authorName);
        }else
        {
            System.out.println("Author already added: " + authorName);
        }
    }

    //Remove Author
    public void removeAuthor(String authorName) {
        if(authors.contains(authorName)){
            authors.remove(authorName);
            System.out.println("Author removed: " + authorName);
        }else{
            System.out.println("Author does not exist: " + authorName);
        }
    }
}
