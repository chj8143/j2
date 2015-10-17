package com.j2.factory.pizzafm;

public class SMStylePepperoniPizza extends Pizza {
 public SMStylePepperoniPizza() {
  name = "SM Style Pepperoni Pizza";
  dough = "Thick Crust Dough";
  sauce = "Spicy Tomato Sauce";
 
  toppings.add("Shredded Mozzarella Cheese");
  toppings.add("Black Olives");
  toppings.add("Cheddar Cheese");
  toppings.add("Corn");
  toppings.add("Sliced Pepperoni");
 }
}