package com.j2.state.player;

public class StoppedState implements State {
 MediaPlayer mp;
 
 public StoppedState(MediaPlayer mp) {
  this.mp = mp;
 }
  
 public void insertCD() {
  System.out.println("Please Wait, we are already have a CD");
 }
 
 public void ejectCD() {
  System.out.println("CD returned");
  mp.setState(mp.getNoCDState());
 }
 
 public void play() {
   System.out.println("Playing this CD again");
   mp.setState(mp.getPlayedState());
 }
 
 public void displayOff() {
   System.out.println("We are already turn off a display");
 }
 
 public void displaySleep() {
   System.out.println("Sleep Mode"); 
 }
 public String toString() {
  return "Playing is stopped";
 }
}