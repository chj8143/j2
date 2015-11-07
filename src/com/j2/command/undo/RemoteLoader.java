package com.j2.command.undo;

public class RemoteLoader {
 
 public static void main(String[] args) {
  RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
 
  Light diningRoomLight = new Light("Dining Room");
 
  LightOnCommand diningRoomLightOn = new LightOnCommand(diningRoomLight);
  LightOffCommand diningRoomLightOff = new LightOffCommand(diningRoomLight);
 
  remoteControl.setCommand(0, diningRoomLightOn, diningRoomLightOff);

  remoteControl.onButtonWasPushed(0);
  remoteControl.offButtonWasPushed(0);
  System.out.println(remoteControl);
  remoteControl.undoButtonWasPushed();
  System.out.println("\n");
  
  Audio audio = new Audio("BedRoom");
   
  AudioLowCommand audioLow = new AudioLowCommand(audio);
  AudioHighCommand audioHigh = new AudioHighCommand(audio);
  AudioOffCommand audioOff = new AudioOffCommand(audio);
  
  remoteControl.setCommand(0, audioLow, audioOff);
  remoteControl.setCommand(1, audioHigh, audioOff);
   
  remoteControl.onButtonWasPushed(0);
  remoteControl.offButtonWasPushed(0);
  System.out.println(remoteControl);
  remoteControl.undoButtonWasPushed();
  
  remoteControl.onButtonWasPushed(1);
  System.out.println(remoteControl);
  remoteControl.undoButtonWasPushed();
 }
}