package com.j2.factory.newCase;

public class Circle extends Figure {
 FigureAttributeFactory attributeFactory;
 
 public Circle(FigureAttributeFactory attributeFactory) {
  this.attributeFactory = attributeFactory;
 }
 
 void prepare() {
  System.out.println("Preparing " + name);
  dimension = attributeFactory.createDimension();
  shadow = attributeFactory.createShadow();
  colors = attributeFactory.createColors();
 }
}