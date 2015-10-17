package com.j2.factory.newCase;


public class FigureTestDrive {
 
 public static void main(String[] args) {
  FigureStore smStore = new SMFigureStore();
  FigureStore abStore = new ABFigureStore();
 
  Figure figure = smStore.orderFigure("triangle");
  System.out.println("Ethan made a " + figure + "\n");
 
  figure = abStore.orderFigure("triangle");
  System.out.println("Joel made a " + figure + "\n");

  figure = smStore.orderFigure("square");
  System.out.println("Ethan made a " + figure + "\n");
 
  figure = abStore.orderFigure("square");
  System.out.println("Joel made a " + figure + "\n");

  figure = smStore.orderFigure("circle");
  System.out.println("Ethan made a " + figure + "\n");
 
  figure = abStore.orderFigure("circle");
  System.out.println("Joel made a " + figure + "\n");

 }
}