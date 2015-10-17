package com.j2.factory.newCase;


public interface FigureAttributeFactory {
 
 public Dimension createDimension();
 public Shadow createShadow();
 public Colors[] createColors();
}