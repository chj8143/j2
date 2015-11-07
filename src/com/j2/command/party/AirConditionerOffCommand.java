package com.j2.command.party;

public class AirConditionerOffCommand implements Command {
 AirConditioner airConditioner;

 public AirConditionerOffCommand(AirConditioner airConditioner) {
  this.airConditioner = airConditioner;
 }

 public void execute() {
  airConditioner.off();
 }

 public void undo() {
  airConditioner.on();
 }
}