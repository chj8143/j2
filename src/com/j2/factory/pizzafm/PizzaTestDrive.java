package com.j2.factory.pizzafm;

public class PizzaTestDrive {
 
 public static void main(String[] args) {
  PizzaStore nyStore = new NYPizzaStore();
  PizzaStore chicagoStore = new ChicagoPizzaStore();
  PizzaStore smStore = new SMPizzaStore();
 
  Pizza pizza = nyStore.orderPizza("cheese");
  System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
  pizza = chicagoStore.orderPizza("cheese");
  System.out.println("Joel ordered a " + pizza.getName() + "\n");
  
  pizza = smStore.orderPizza("cheese");
  System.out.println("HJ ordered a " + pizza.getName() + "\n");
  

  pizza = nyStore.orderPizza("clam");
  System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
  pizza = chicagoStore.orderPizza("clam");
  System.out.println("Joel ordered a " + pizza.getName() + "\n");

  pizza = smStore.orderPizza("clam");
  System.out.println("HJ ordered a " + pizza.getName() + "\n");
  
  
  pizza = nyStore.orderPizza("pepperoni");
  System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
  pizza = chicagoStore.orderPizza("pepperoni");
  System.out.println("Joel ordered a " + pizza.getName() + "\n");

  pizza = smStore.orderPizza("pepperoni");
  System.out.println("HJ ordered a " + pizza.getName() + "\n");
  
 
  
  pizza = nyStore.orderPizza("veggie");
  System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
  pizza = chicagoStore.orderPizza("veggie");
  System.out.println("Joel ordered a " + pizza.getName() + "\n");
 
 
 pizza = smStore.orderPizza("veggie");
  System.out.println("HJ ordered a " + pizza.getName() + "\n");
 }
}