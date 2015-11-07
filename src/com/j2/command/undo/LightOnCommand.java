package com.j2.command.undo;

public class LightOnCommand implements Command {
 Light light;
 int level;
 public LightOnCommand(Light light) {
   this.light = light;
 }
 
 public void execute() {
   level = light.getLevel();
   light.on();
 }
 
 public void undo() {
   if(level == Light.lightON) {
     light.on();
   } else if (level == Light.lightOFF) {
     light.off();
   }
 }
}