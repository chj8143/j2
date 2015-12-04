package com.j2.state.gumballstate;

import java.util.Random;

public class HasQuarterState implements State {
  Random randomBreak = new Random(System.currentTimeMillis());
  GumballMachine gm;
  
  public HasQuarterState(GumballMachine gm) {
    this.gm = gm;
  }
  
  public void insertQuarter(){
    System.out.println("You cannot insert another quarter");
  }
  public void ejectQuarter(){
    System.out.println("Quarter returned");
    
  }
  public void turnCrank(){
    System.out.println("You turned...");
    int bd = randomBreak.nextInt(3);
    if ((bd == 0) && (gm.getCount() > 1)) {
      gm.setState(gm.getBreakDownState());
    } else {
      gm.setState(gm.getSoldState());
    }
  }
  public void dispense(){
    System.out.println("No gumball dispense");
  }
  public void refill(){}
    public String toString() {
      return "waiting for turn of crank";
    }
  }