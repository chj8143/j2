package com.j2.factory.pizzafm;

public class SMStyleVeggiePizza extends Pizza {
 public SMStyleVeggiePizza() {
  name = "SM Style Veggie Pizza";
  dough = "Super Thin Crust Dough";
  sauce = "Spicy Tomato Sauce";
 
  toppings.add("Parmesan Cheese");
  toppings.add("Sweet Potatoes");
  toppings.add("Spinach");
  toppings.add("Onion");
 }
 
 void cut() {
  System.out.println("Cutting the pizza into square slices");
 }
}