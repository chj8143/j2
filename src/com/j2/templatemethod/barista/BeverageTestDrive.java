package com.j2.templatemethod.barista;

public class BeverageTestDrive {
 public static void main(String[] args) {
 
   
  Coffee caramelMacchiato = new CaramelMacchiato();
 
  System.out.println("\n-------[caramel macchiato]-------");
  caramelMacchiato.prepareRecipe();

 
 }
}