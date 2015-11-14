package com.j2.facade.smarthome;

public class Monitor {
 String description;
 Desktop desktop;
 
 public Monitor(String description, Desktop desktop) {
  this.description = description;
  this.desktop = desktop;
 }
 
 public void on() {
  System.out.println(description + " on");
 }
 
 public void off() {
  System.out.println(description + " off");
 }

 public String toString() {
   return description;
 }
}