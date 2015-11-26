package com.j2.iterator.dinermenu.after;

import java.util.ArrayList;

public class PancakeHouseMenu implements Menu {
    ArrayList menuItems;
 
    public PancakeHouseMenu() {
        menuItems = new ArrayList();
    
        addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
        addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59);
        
        addItem("Âý½ÒÆÒÄÉÀÌÅ©", "Âý½Ò°¡·ç·Î ¸¸µç ÆÒÄÉÀÌÅ©", true, 3.59);
        addItem("Ã¤¼ÒÆÒÄÉÀÌÅ©", "Ã¤¼Ò¸¦ ³ÖÀº ÆÒÄÉÀÌÅ©", true, 4.49);
        addItem("¾Æ¸óµåÃÊÄÝ¸´ÆÒÄÉÀÌÅ©", "¾Æ¸óµå¸¦ ³ÖÀº ÃÊÄÝ¸´ ÆÒÄÉÀÌÅ©", true, 5.99);
    }
    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }
    public ArrayList getMenuItems() {
        return menuItems;
    }
    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }
    public String toString() {
        return "Objectville Pancake House Menu";
    }
}