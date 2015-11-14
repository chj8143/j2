package com.j2.adapter.iterenum;

import java.util.*;

public class EI {
 public static void main (String args[]) {
  Vector<String> v = new Vector<String>(Arrays.asList(args));
  Enumeration<String> enumeration = v.elements();
  while (enumeration.hasMoreElements()) {
   System.out.println("iterator -> enumeration: " + enumeration.nextElement());
  }
  Iterator<String> iterator = v.iterator();
  while (iterator.hasNext()) {
   System.out.println("enumeration -> iterator: " + iterator.next());
  }
 }
}