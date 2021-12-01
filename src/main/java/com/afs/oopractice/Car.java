package com.afs.oopractice;

public class Car {
  private String name;
  private int speed;

  public Car(String name, int speed) {
    this.name = name;
    this.speed = speed;
  }

  public void speedup() {
    System.out.printf("%s: speed up %d km/h\n", name, speed);
  }

}
