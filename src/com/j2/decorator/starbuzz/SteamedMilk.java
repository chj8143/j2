package com.j2.decorator.starbuzz;

public class SteamedMilk extends CondimentDecorator {
 
 public SteamedMilk(Beverage beverage) {
  this.beverage = beverage;
 }
 
 public String getDescription() {
  return beverage.getDescription() + ", SteamedMilk and Milk foam";
 }
 
 public double cost() {
  return .50 + beverage.cost();
 }
}