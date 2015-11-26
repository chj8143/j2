package com.j2.iterator.dinermenu.after;

public class Waitress {
    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;
 
    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }
    public void printMenu() {
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();

        System.out.println("MENU\n----\nPANCAKE");
        printMenu(pancakeIterator);
        System.out.println("\nDISH");
        printMenu(dinerIterator);
    }
    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
   
    public void printVegetarianMenu() {
      System.out.println("MENU\n----\nPANCAKE");
      printVegetarianMenu(pancakeHouseMenu.createIterator());
      System.out.println("\nDISH");
      printVegetarianMenu(dinerMenu.createIterator());
    }
 
    public boolean isItemVegetarian(String name) {
      Iterator breakfastIterator = pancakeHouseMenu.createIterator();
      if (isVegetarian(name, breakfastIterator)) {
        return true;
      }
  
      Iterator dinnerIterator = dinerMenu.createIterator();
      
      if (isVegetarian(name, dinnerIterator)) {
        return true;
      }
      return false;
    }
    
 
    private void printVegetarianMenu(Iterator iterator) {
      while (iterator.hasNext()) {
        MenuItem menuItem = (MenuItem)iterator.next();
        if (menuItem.isVegetarian()) {
          System.out.print(menuItem.getName() + ", ");
          System.out.print(menuItem.getPrice() + " -- ");
          System.out.println(menuItem.getDescription());
        }
      }
    }


    private boolean isVegetarian(String name, Iterator iterator) {
      while (iterator.hasNext()) {
        MenuItem menuItem = (MenuItem)iterator.next();
        if (menuItem.getName().equals(name)) {
          if (menuItem.isVegetarian()) {
            return true;
          }
        }
      }
      return false;
    }
}