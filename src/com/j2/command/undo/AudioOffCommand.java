package com.j2.command.undo;

public class AudioOffCommand implements Command {
 Audio audio;
 int prevVol;
  
 public AudioOffCommand(Audio audio) {
  this.audio = audio;
 }
 
 public void execute() {
  prevVol = audio.getVolume();
  audio.off();
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