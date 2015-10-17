package com.j2.factory.newCase;

public class ABFigureStore extends FigureStore {
 
 protected Figure createFigure(String item) {
  Figure figure = null;
  FigureAttributeFactory attributeFactory = 
   new ABAttributeFactory();
 
  if (item.equals("triangle")) {
  
   figure = new Triangle(attributeFactory);
   figure.setName("AB Style Triangle");
  
  } else if (item.equals("square")) {
 
   figure = new Square(attributeFactory);
   figure.setName("AB Style Square");
 
  } else if (item.equals("circle")) {
 
   figure = new Circle(attributeFactory);
   figure.setName("AB Style Circle");
 
  }
  return figure;
 }
}