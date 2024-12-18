package hust.soict.dsai.aims.media;

import java.util.Comparator;

public abstract class Media {
    //Attribute
    private static int nbMedia = 0;
    private int id;
    private String title;
    private String category;
    private float cost;

    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

    // Constructor
    public Media(String title, String category, float cost) {
        this.id = nbMedia++;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    public Media(String title) {
        this.title = title;
    }

    public Media() {
        this.id = nbMedia++;
    }

    //Getter
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getCategory() {
        return category;
    }
    public float getCost() {
        return cost;
    }
    //Setter
    public void setId(int id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }
    //Method
    public boolean isMatch(String title)
    {
        return this.getTitle().equals(title);
    }
    @Override
    public boolean equals(Object object){
        if (object instanceof Media) {
            try {
                Media that = (Media) object;
                return this.title.equalsIgnoreCase(that.getTitle());
            } catch (NullPointerException | ClassCastException e1) {
                return false;
            }
        } else {
            return false;
        }
    }

    public String toString() {
        return "Media{" +
                "id=" + id + '\'' +
                "title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", cost=" + cost +
                '}';
    }
    public abstract String getDetails();

}
