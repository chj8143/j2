package com.j2.facade.smarthome;

public class SmartHomeTestDrive {
 public static void main(String[] args) {
  Amplifier amp = new Amplifier("Amplifier");
  CdPlayer cd = new CdPlayer("CD Player", amp);
  DeskLamp lamp = new DeskLamp("LED lamp");
  Desktop desktop = new Desktop("Desktop");
  Monitor monitor = new Monitor("Monitor", desktop);
 
  SmartHomeFacade smarthome = 
    new SmartHomeFacade(amp, cd, 
      lamp, desktop, monitor);
 
  smarthome.beginStudy("1974-wayhome - Mondo Grosso");
  smarthome.endStudy();
 }
}