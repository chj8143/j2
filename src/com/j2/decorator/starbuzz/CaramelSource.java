package com.j2.decorator.starbuzz;

public class CaramelSource extends CondimentDecorator {
 
 public CaramelSource(Beverage beverage) {
  this.beverage = beverage;
 }
 
 public String getDescription() {
  return beverage.getDescription() + ", CaramelSource";
 }
 
 public double cost() {
  return .20 + beverage.cost();
 }
}