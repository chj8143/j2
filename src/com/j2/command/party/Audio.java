package com.j2.command.party;

public class Audio {
 String location;
 
 public Audio(String location) {
  this.location = location;
 }
  
public void on() {
  System.out.println(location + " Audio is on");
 }

 public void off() {
  System.out.println(location + " Audio is off");
 }
 }
