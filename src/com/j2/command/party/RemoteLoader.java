package com.j2.command.party;

public class RemoteLoader {

 public static void main(String[] args) {

  RemoteControl remoteControl = new RemoteControl();

  Light light = new Light("Bed Room");
  AirConditioner airConditioner = new AirConditioner("Bed Room");
  Audio audio = new Audio("Bed Room");
 
  LightOnCommand lightOn = new LightOnCommand(light);
  AirConditionerOnCommand airConditionerOn = new AirConditionerOnCommand(airConditioner);
  AudioOnCommand audioOn = new AudioOnCommand(audio);
  LightOffCommand lightOff = new LightOffCommand(light);
  AirConditionerOffCommand airconditionerOff = new AirConditionerOffCommand(airConditioner);
  AudioOffCommand audioOff = new AudioOffCommand(audio);

  Command[] partyOn = { lightOn, airConditionerOn, audioOn};
  Command[] partyOff = { lightOff, airconditionerOff, audioOff};
  
  MacroCommand partyOnMacro = new MacroCommand(partyOn);
  MacroCommand partyOffMacro = new MacroCommand(partyOff);
 
  remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
  
  System.out.println(remoteControl);
  System.out.println("--- Pushing Macro On---");
  remoteControl.onButtonWasPushed(0);
  System.out.println("--- Pushing Macro Off---");
  remoteControl.offButtonWasPushed(0);
 }
}