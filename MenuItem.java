package restaurant;

import java.util.Date;
public class MenuItem {
    //Fields
    private String name;
    private double price;
    private String description;
    private String category;
    private Date dateAdded;

    //Constructor
    public MenuItem(String name, String description, double price, String category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.dateAdded = new Date();
    }

    //Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

     public void setCategory(String category) {
        this.category = category;
    }

   public Date getDateAdded() {
        return dateAdded;
   }

   //TODO: Override Special Methods

    @Override
    public String toString() {
        String newText =  isNew() ? " - NEW!" : "";
        return "\n" + name + " | $" + price + newText + '\n' +
                description + '\n'
                ;
    }


    //TODO: Instance Methods
    boolean isNew() {
        //Subtract item's dateAdded from today's date and return true if it's less than 90 days
        return true;
    }

    @Override
    public boolean equals(Object toBeCompared) {
        // Reference Check
        if (this == toBeCompared) {
            return true;
        }
        // Null check
        if (toBeCompared == null) {
            return false;
        }
        // Class CHeck
        if (getClass() != toBeCompared.getClass()) {
            return false;
        }

        MenuItem otherItem = (MenuItem) toBeCompared;

        return this.name.equals(otherItem.getName());
    }
}
