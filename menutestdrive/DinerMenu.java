/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menutestdrive;

import java.util.Arrays;
import java.util.Iterator;

/**
 *
 * @author galindo
 */
public class DinerMenu {

    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem(
                "Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat",
                true,
                2.99
        );

        addItem(
                "BLT",
                "Bacon with lettuce & tomato on whole wheat",
                false,
                2.99
        );

        addItem(
                "Soup of the day",
                "Soup of the day, with a side of potato salad",
                false,
                3.29
        );

        addItem(
                "Hotdog",
                "A hot dog, with sauerkraut, relish, onions, topped with cheese",
                false,
                3.05
        );

        addItem(
                "Hotdog 2",
                "A hot dog, with sauerkraut, relish, onions, topped with cheese",
                false,
                3.05
        );

        addItem(
                "Hotdog 3",
                "A hot dog, with sauerkraut, relish, onions, topped with cheese",
                false,
                3.05
        );

    }

    public void addItem(String name,
            String description,
            boolean vegetarian,
            double price) {

        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);

        if (numberOfItems < MAX_ITEMS) {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        } else {
            System.err.println("Sorry, menu is full! Can't add item to menu");
        }
    }

//    public MenuItem[] getMenuItems() {
//        return menuItems;
//    }
    
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
//        return Arrays.stream(menuItems).iterator();
    }
}
