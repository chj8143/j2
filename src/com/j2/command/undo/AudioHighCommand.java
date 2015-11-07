package com.j2.command.undo;

public class AudioHighCommand implements Command {
 Audio audio;
 int prevVol;
  
 public AudioHighCommand(Audio audio) {
  this.audio = audio;
 }
 
 public void execute() {
  prevVol = audio.getVolume();
  audio.high();
 }
 
 public void undo() {
  if (prevVol == Audio.HIGH) {
   audio.high();
  } else if (prevVol == Audio.LOW) {
   audio.low();
  } else if (prevVol == Audio.OFF) {
   audio.off();
  }
 }
}