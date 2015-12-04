package com.j2.state.gumballstate;

public class GumballMachineTestDrive {
  //random으로 고장나도록 구현
  public static void main(String[] args) {
    GumballMachine gm = new GumballMachine(2);
    System.out.println(gm);
    
    gm.insertQuarter();
    gm.turnCrank();

    System.out.println(gm);

    gm.insertQuarter();
    gm.turnCrank();
    gm.insertQuarter();
    gm.turnCrank();
  
    gm.refill(5);
    gm.insertQuarter();
    gm.turnCrank();

    System.out.println(gm);
 }
}