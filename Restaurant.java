package restaurant;

public class Restaurant {
    public static void main(String[] args) {
        //TODO: Create Various Menu Items
        MenuItem item1 = new MenuItem("Pepperoni Pizza", "The classic slice, hot and delicious!", 7.39, "main course");
        MenuItem item2 = new MenuItem("Toasted Ravioli", "A St. Louis favorite, served with a side of pizza sauce.", 6.89, "appetizer");
        MenuItem item3 = new MenuItem("Chocolate Cake", "Rich, moist cake with dark chocolate cream cheese frosting", 4.99, "dessert");
        MenuItem item4 = new MenuItem("Fried Pickles", "Deep fried thinly sliced Dill Pickles", 3.99, "appetizer");
        MenuItem item5 = new MenuItem("Pepperoni Pizza", "The classic slice, hot and delicious!", 7.39, "main course");

        //TODO: Create a menu
        Menu menu = new Menu();
        //TODO: Add menu items to menu
        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);
        menu.addItem(item4);


        //TODO: Print the entire menu
        System.out.println(menu);
        //TODO: Print just one menu item
        //System.out.println(item1);
        // TODO: Remove an item and reprint menu
        menu.removeItem(item4);
        System.out.println(menu);
        //Test equals method
        //test item5 to confirm it is a copy of item1
//        menu.addItem(item5);
//        System.out.println(item1.equals(item2));
//        System.out.println(item1 == item5);
//        System.out.println(item1.equals(item5));

        // TODO: Try to add a duplicate
        menu.addItem(item5);
    }

}
