package restaurant;

import java.util.ArrayList;
import java.util.Date;


public class Menu {
    //Fields
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private Date lastUpdated;

    //Default Constructor

    //Getters and Setters
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    //Define custom toString() method
    @Override
    public String toString() {
        StringBuilder appetizers = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("appetizer")) {
                appetizers.append(item.toString());
            }
        }
        StringBuilder mainCourses = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("main course")) {
                mainCourses.append(item.toString());
            }
        }
        StringBuilder desserts = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("dessert")) {
                desserts.append(item.toString());
            }
        }
        return "TONY'S PIZZA MENU\n" +
        "********************\nAPPETIZERS\n" + appetizers.toString() + "\n" +
        "********************\nMAIN COURSES\n" + mainCourses.toString() + "\n" +
        "********************\nDESSERTS\n" + desserts.toString()
        ;
    }

    //instance methods
    void addItem(MenuItem newItem) {
        String message = newItem.getName() +" has already been added to the menu.";
        if (menuItems.contains(newItem)){
            System.out.println(message);
            return;
        }
        for (MenuItem item : menuItems) {
            if (item.equals(newItem)) {  //Uses our custom equals method
                System.out.println(message);
                return;
            }
        }
        menuItems.add(newItem);
        lastUpdated = new Date();
    }

    void removeItem(MenuItem item) {
        menuItems.remove(item);
        lastUpdated = new Date();
    }

}
