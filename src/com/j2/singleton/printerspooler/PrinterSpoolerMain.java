package com.j2.singleton.printerspooler;

public class PrinterSpoolerMain {
  public static void main(String[] args) {
    System.out.println("--- Printer Spooler with subclass ---");
    PrinterSpooler aa = PrinterSpoolerA.getInstance();
    PrinterSpooler bb = PrinterSpoolerB.getInstance();
    System.out.print("A - ");
    aa.print();
    System.out.print("B - ");
    bb.print();
    System.out.print("A - ");
    aa.drain();
    System.out.print("B - ");
    bb.fill();
    System.out.print("B - ");
    bb.print();
    System.out.print("B - ");
    bb.drain();
  }
}