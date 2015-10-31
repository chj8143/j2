package com.j2.singleton.printerspooler;

public class PrinterSpoolerA extends PrinterSpooler {
  protected static PrinterSpooler uniqueInstance;
 
 private PrinterSpoolerA() {
   super();
 }
}