package com.j2.singleton.chocolate;

public class ChocolateBoiler {
  private boolean empty;
  private boolean boiled;
  private static ChocolateBoiler uniqueInstance;
  private static int numCalled = 0;
  
  private ChocolateBoiler() {
    empty = true;
    boiled = false;
  }
  
  public synchronized static ChocolateBoiler getInstance() {
    if (uniqueInstance == null) {
      System.out.println("Making unique instance of Chocolate Boiler");
      uniqueInstance = new ChocolateBoiler();
    }
    System.out.println("Returning instance"+" -- numCalled: " + numCalled++);
    return uniqueInstance;
  }
  
  //fill the Chocolate boiler
  public void fill() {
    if (isEmpty()) {
      empty = false;
      boiled = false;
    }
  }
  
    // drain the boiled milk and chocolate 
  public void drain() {  
    if (!isEmpty() && isBoiled()) {  
      empty = true; 
    } 
  }
 
  // bring the contents to a boil
  public void boil() { 
    if (!isEmpty() && !isBoiled()) {
      boiled = true;
    }  
  }
   
  public boolean isEmpty() { 
    return empty;
  }

  public boolean isBoiled() {
    return boiled;  
  }
}