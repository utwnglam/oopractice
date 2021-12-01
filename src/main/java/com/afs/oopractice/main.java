package com.afs.oopractice;

public class main {
  public static void main(String[] args) {
    Car car = new Car("Car", 30);
    Truck truck = new Truck("Truck", 10);

    car.speedup();
    truck.speedup();

    Driver carDriver = new Driver(car);
    carDriver.speedup();
    Driver truckDriver = new Driver(truck);
    truckDriver.speedup();


  }
}
