package com.j2.state.player;

public interface State {

  public void insertCD();
  public void ejectCD();
  public void play();
  public void displayOff();
  public void displaySleep();
}