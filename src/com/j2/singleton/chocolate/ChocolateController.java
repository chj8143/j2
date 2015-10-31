package com.j2.singleton.chocolate;
 
public class ChocolateController {
 public static void main(String args[]) {
   System.out.println("--- Thread safe Chocolate Boiler ---");
  ChocolateBoiler boiler = ChocolateBoiler.getInstance();
  boiler.fill();
  boiler.boil();
  boiler.drain();

  //return the existing instance
  ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
 }
}