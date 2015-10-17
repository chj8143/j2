package com.j2.factory.newCase;

public class SMFigureStore extends FigureStore {
 
 protected Figure createFigure(String item) {
  Figure figure = null;
  FigureAttributeFactory attributeFactory = 
   new SMAttributeFactory();
 
  if (item.equals("triangle")) {
  
   figure = new Triangle(attributeFactory);
   figure.setName("SM Style Triangle");
  
  } else if (item.equals("square")) {
 
   figure = new Square(attributeFactory);
   figure.setName("SM Style Square");
 
  } else if (item.equals("circle")) {
 
   figure = new Circle(attributeFactory);
   figure.setName("SM Style Circle");
 
  }
  return figure;
 }
}