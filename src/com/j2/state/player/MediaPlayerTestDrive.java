package com.j2.state.player;

public class MediaPlayerTestDrive {
 public static void main(String[] args) {
  MediaPlayer mp = new MediaPlayer("[Eternal Sunshine Of The Spotless Mind]");

  System.out.println(mp);

  mp.insertCD();
  mp.play();

  System.out.println(mp);

  mp.insertCD();
  mp.ejectCD();
  mp.displaySleep();
  mp.displayOff();
  System.out.println(mp);
 }
}