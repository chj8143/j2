package com.j2.command.party;

public class AirConditioner {
 String location;

 public AirConditioner(String location) {
  this.location = location;
 }

 public void on() {
  System.out.println(location + " Air conditioner is on");
 }

 public void off() {
  System.out.println(location + " Air conditioner is off");
 }

}