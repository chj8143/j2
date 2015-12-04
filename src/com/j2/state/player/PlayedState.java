package com.j2.state.player;

public class PlayedState implements State {
 MediaPlayer mp;
 
 public PlayedState(MediaPlayer mp) {
  this.mp = mp;
 }
  
 public void insertCD() {
  System.out.println("Please Wait, we are already playing a CD");
 }
 
 public void ejectCD() {
  System.out.println("Oh..sorry. We are playing a CD");
 }
 
 public void play() {
   System.out.println("We are already playing a CD");
 }
 
 public void displayOff() {
   System.out.println("Stopped play. Display off");
   mp.setState(mp.getStoppedState());
 }
 
 public void displaySleep() {
   System.out.println("We cannot change into sleep Mode"); 
 }
 public String toString() {
  return "playing a CD";
 }
}