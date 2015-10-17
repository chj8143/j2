package com.j2.factory.newCase;

public class ABAttributeFactory implements FigureAttributeFactory {
 
 public Dimension createDimension() {
  return new ThreeDimension();
 }
 
 public Shadow createShadow() {
  return new BlackShadow();
 }

 
 public Colors[] createColors() {
  Colors colors[] = { new Red(), new Blue(), new Orange() };
  return colors;
 }
 
}