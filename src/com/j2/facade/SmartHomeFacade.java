package com.j2.facade.smarthome;

public class SmartHomeFacade {
 Amplifier amp;
 CdPlayer cd;
 DeskLamp lamp;
 Desktop desktop;
 Monitor monitor;
 
 public SmartHomeFacade(Amplifier amp, CdPlayer cd, DeskLamp lamp, Desktop desktop, Monitor monitor) {
  this.amp = amp;
  this.cd = cd;
  this.lamp = lamp;
  this.desktop = desktop;
  this.monitor = monitor;
 }
 
 public void beginStudy(String title) {
  System.out.println("Get ready to study...");
  lamp.dim(70);
  amp.on();
  amp.setCd(cd);
  amp.setSurroundSound();
  amp.setVolume(3);
  cd.on();
  cd.play(title);
  desktop.on();
  monitor.on();
 }
 
 
 public void endStudy() {
  System.out.println("End study...");
  desktop.off();
  monitor.off();
  amp.off();
  cd.stop();
  cd.eject();
  cd.off();
  lamp.off();
}
}