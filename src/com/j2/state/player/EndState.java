package com.j2.state.player;

public class EndState implements State {
 MediaPlayer mp;
 
 public EndState(MediaPlayer mp) {
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
   System.out.println("It is over. Please eject");
 }
 
 public void displayOff() {
   System.out.println("Display off");
 }
 
 public void displaySleep() {
   System.out.println("Sleep Mode"); 
 }
 public String toString() {
  return "Playing is over";
 }
}