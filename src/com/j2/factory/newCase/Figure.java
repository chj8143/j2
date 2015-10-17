package com.j2.factory.newCase;

public abstract class Figure {
 String name;

 Dimension dimension;
 Shadow shadow;
 Colors colors[];

 abstract void prepare();

 void paint() {
  System.out.println("painting");
 }

 void setName(String name) {
  this.name = name;
 }

 String getName() {
  return name;
 }

 public String toString() {
  StringBuffer result = new StringBuffer();
  result.append("---- " + name + " ----\n");
  if (dimension != null) {
   result.append(dimension);
   result.append("\n");
  }
  if (shadow != null) {
   result.append(shadow);
   result.append("\n");
  }
  if (colors != null) {
   for (int i = 0; i < colors.length; i++) {
    result.append(colors[i]);
    if (i < colors.length-1) {
     result.append(", ");
    }
   }
   result.append("\n");
  }
 
  return result.toString();
 }
}