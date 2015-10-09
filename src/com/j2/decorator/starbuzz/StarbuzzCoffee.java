package com.j2.decorator.starbuzz;

public class StarbuzzCoffee {
  public static void main(String args[]) {
    
    //Caramel Macchiato
    Beverage beverage = new Espresso();
     beverage = new BanillaSyrup(beverage);
     beverage = new SteamedMilk(beverage);
     beverage = new CaramelSource(beverage);
     System.out.println(beverage.getDescription() 
    + " $" + beverage.cost());
 
 }
}