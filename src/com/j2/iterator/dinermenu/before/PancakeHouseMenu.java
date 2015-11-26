package com.j2.iterator.dinermenu.before;

import java.util.ArrayList;

public class PancakeHouseMenu {
  ArrayList menuItems;
  public PancakeHouseMenu() {
    menuItems = new ArrayList();
    addItem("---Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("---BLT",
                "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("---Soup of the day",
                "Soup of the day, with a side of potato salad", false, 3.29);
    }
  public void addItem(String n, String d, boolean v, double p) {
    MenuItem menuItem = new MenuItem(n, d, v, p);
      menuItems.add(menuItem);
    }
   public ArrayList getMenuItems() {
    return menuItems;
  }
  }