package hust.soict.dsai.aims.media;

public abstract class Media {
    //Attribute
    private int id;
    private String title;
    private String category;
    private float cost;
    // Constructor
    public Media(int id, String title, String category, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public Media() {

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
    public String toString()
    {
        return "Media "+ getId()+". " + getTitle() + " - " + getCategory() + " - " + getCost() +" $ ";
    }
}
