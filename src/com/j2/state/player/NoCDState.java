package com.j2.state.player;

public class NoCDState implements State {
 MediaPlayer mp;
 
 public NoCDState(MediaPlayer mp) {
  this.mp = mp;
 }
  
 public void insertCD() {
  System.out.println("You inserted a CD");
  mp.setState(mp.getHasCDState());
 }
 
 public void ejectCD() {
  System.out.println("You haven't inserted a CD");
 }
 
 public void play() {
   System.out.println("You pressed, but there is no CD");
 }
 
 public void displayOff() {
   System.out.println("Display off");
 }
 public void displaySleep() {
   System.out.println("Sleep Mode"); 
 }
 public String toString() {
  return "waiting for CD";
 }
}