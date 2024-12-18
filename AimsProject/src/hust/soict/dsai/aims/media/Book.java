package hust.soict.dsai.aims.media;

import hust.soict.dsai.aims.exception.DupplicatedItemException;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {

    //Attribute
    private List<String> authors = new ArrayList<String>();

    //Constructor
    public Book(String title, String category, float cost) {
        super(title, category, cost);
    }

    public Book(String title, String category, float cost,List<String> authors) {
        super(title, category, cost);
        this.authors = authors;
    }

    @Override
    //toString
    public String toString()
    {
        return "BOOK - " +getId() +". "+ getTitle() + " - " + "category: "+getCategory() + " - "+
                "list authors: "+ authors +": " + "Cost: "+getCost() +" $ ";
    }

    public String getDetails() {
        StringBuffer authorsList = new StringBuffer();
        if (this.authors.size() >= 1) {
            authorsList.append(this.authors.get(0));
            for (int i = 1; i < this.authors.size(); i++) {
                authorsList.append(", " + this.authors.get(i));
            }
        }
        return ("Product ID: " + String.valueOf(this.getId())
                + "\n" + "\t" + "Title: " + this.getTitle()
                + "\n" + "\t" + "Category: " + this.getCategory()
                + "\n" + "\t" + "Authors: " + authorsList
                + "\n" + "\t" + "Price: $" + String.valueOf(this.getCost()));
    }


    //Add Authors
    public void addAuthor(String authorName) throws DupplicatedItemException {
        if (authors.contains(authorName)) {
            // Nếu tác giả đã tồn tại trong danh sách, ném ngoại lệ DupplicatedItemException
            throw new DupplicatedItemException("Author " + authorName + " is already added.");
        }
        authors.add(authorName); // Nếu chưa có, thêm tác giả vào danh sách
        System.out.println("Author added: " + authorName);
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
