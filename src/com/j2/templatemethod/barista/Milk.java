package com.j2.templatemethod.barista;

public class Milk extends CondimentDecorator {
 Beverage beverage;

 public Milk(Beverage beverage) {
  this.beverage = beverage;
 }

 public String getDescription() {
  return beverage.getDescription() + ", Steamed Milk";
 }

 public double cost() {
  return .10 + beverage.cost();
 }
}