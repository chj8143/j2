package com.j2.command.party;

public class AudioOffCommand implements Command {
 Audio audio;
  
 public AudioOffCommand(Audio audio) {
  this.audio = audio;
 }
 
 public void execute() {
  audio.off();
 }
 
 public void undo() {
   audio.on();
  }
 }
