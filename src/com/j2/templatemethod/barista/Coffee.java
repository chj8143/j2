package com.j2.templatemethod.barista;

public abstract class Coffee extends CaffeineBeverage {
 public void brew() {
  System.out.println("Dripping Coffee through filter");
 }
 public abstract void addCondiments();
}