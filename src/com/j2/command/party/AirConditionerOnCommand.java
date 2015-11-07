package com.j2.command.party;

public class AirConditionerOnCommand implements Command {
 AirConditioner airConditioner;

 public AirConditionerOnCommand(AirConditioner airConditioner) {
  this.airConditioner = airConditioner;
 }

 public void execute() {
  airConditioner.on();
 }

 public void undo() {
  airConditioner.off();
 }
}