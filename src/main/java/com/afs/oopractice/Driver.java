package com.afs.oopractice;

public class Driver {
  private final Vehicle vehicle;

  public Driver(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  public void speedup() {
    vehicle.speedup();
  }
}
