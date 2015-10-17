package com.j2.factory.pizzaaf;

public class PotatoPizza extends Pizza {
 PizzaIngredientFactory ingredientFactory;
 
 public PotatoPizza(PizzaIngredientFactory ingredientFactory) {
  this.ingredientFactory = ingredientFactory;
 }
 
 void prepare() {
  System.out.println("Preparing " + name);
  dough = ingredientFactory.createDough();
  sauce = ingredientFactory.createSauce();
  veggies = ingredientFactory.createVeggies();
  cheese = ingredientFactory.createCheese();
  potato = ingredientFactory.createPotato();
 }
}