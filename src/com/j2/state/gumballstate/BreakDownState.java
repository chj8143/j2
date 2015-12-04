package com.j2.state.gumballstate;

public class BreakDownState implements State {
  GumballMachine gm;
  
  public BreakDownState(GumballMachine gm) {
    this.gm = gm;
  }
  
  public void insertQuarter(){
    System.out.println("--Break Down-- You cannot insert another quarter");
  }
  public void ejectQuarter(){
    System.out.println("--Break Down-- Sorry. we cannot give you a quarter");
    
  }
  public void turnCrank(){
    System.out.println("--Break Down-- Sorry. This machine has broken.");
  }
  public void dispense(){
    System.out.println("--Break Down--");
  }
  public void refill(){}
    public String toString() {
      return "Break down";
    }
  }