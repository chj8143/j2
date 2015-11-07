package com.j2.command.undo;

public class Light {
 public static final int lightON = 100;
 public static final int lightOFF = 0;
 String location;
 int level;

 public Light(String location) {
  this.location = location;
 }

 public void on() {
  level = 100;
  System.out.println("Light is on");
 }

 public void off() {
  level = 0;
  System.out.println("Light is off");
 }


 public int getLevel() {
  return level;
 }
}