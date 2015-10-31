package com.j2.singleton.printerspooler;

public class PrinterSpoolerB extends PrinterSpooler { 
  protected static PrinterSpooler uniqueInstance;
 
 private PrinterSpoolerB() {
   super();
 }
}