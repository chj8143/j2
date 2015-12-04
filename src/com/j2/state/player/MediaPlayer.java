package com.j2.state.player;

public class MediaPlayer {
 
 State hasCDState;
 State noCDState;
 State playedState;
 State stoppedState;
 State endState;
 
 State state;
 String title = null;
 
 public MediaPlayer(String title) {
  hasCDState = new HasCDState(this);
  noCDState = new NoCDState(this);
  playedState = new PlayedState(this);
  stoppedState = new StoppedState(this);
  endState = new EndState(this);

  this.title = title;
   if (title != null) {
   state = noCDState;
  } else {
   state = endState;
  }
 }
 
 public void play() {
  state.play();
 }
 
 public void insertCD() {
  state.insertCD();
 }
 
 public void ejectCD() {
  state.ejectCD();
 }
 
 public void displayOff() {
  state.displayOff();
 }
 
 public void displaySleep() {
 }
 
 void releaseCD() {
  System.out.println("A CD comes out...");
 }
 
 String getTitle() {
  return title;
 }

 void setState(State state) {
  this.state = state;
 }
    
 public State getState() {
   return state;
 }

 public State getHasCDState() {
   return hasCDState;
 }

 public State getNoCDState() {
   return noCDState;
 }

    public State getPlayedState() {
        return playedState;
    }

    public State getStoppedState() {
        return stoppedState;
    }
    public State getEndState() {
        return endState;
    }
 
 public String toString() {
  StringBuffer result = new StringBuffer();
  result.append("\nInventory: " + title);
  result.append("\n");
  result.append("Player is " + state + "\n");
  return result.toString();
 }
}