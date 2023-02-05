package org.example;

import org.example.computer.Dell;
import org.example.phone.Apple;

/**
 * Hello world!
 */
public class App {

  public static void main(String[] args) {
    for (int i = 0; i < 100; i += 1) {
      Apple phone = new Apple();
      Dell computer = new Dell();
      phone.printLog();
      computer.printLog();
    }
  }
}
