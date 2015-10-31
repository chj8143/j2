package com.j2.singleton.printerspooler;

public class PrinterSpoolerMain {
  public static void main(String[] args) {
    System.out.println("--- Printer Spooler with subclass ---" + "\n");
    PrinterSpooler aa = PrinterSpoolerA.getInstance();
    PrinterSpooler bb;
    
    System.out.print("A - ");
    aa.fill();
    aa.print();
    aa.drain();
    System.out.println("---------------------------------------" + "\n");
    
    bb = PrinterSpoolerB.getInstance();
    System.out.print("B - ");
    bb.fill();
    bb.print();
    bb.drain();
    System.out.println("---------------------------------------" + "\n");
  }
}