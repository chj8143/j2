package com.j2.command.party;

public class AudioOnCommand implements Command {
 Audio audio;
  
 public AudioOnCommand(Audio audio) {
  this.audio = audio;
 }
 
 public void execute() {
  audio.on();
 }
 
 public void undo() {
   audio.off();
  }
 }
