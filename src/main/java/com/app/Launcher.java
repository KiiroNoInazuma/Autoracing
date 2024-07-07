package com.app;

import com.app.vehicles.Bus;
import com.app.vehicles.Car;
import com.app.vehicles.Truck;
import com.app.vehicles.Vehicle;

public class Launcher {
    public static void main(String[] args) {
        Vehicle car = new Car("Audi", "A4", 2.5);
        Vehicle truck = new Truck("Volvo", "FH", 12.8);
        Vehicle bus = new Bus("MAN", "Lion", 10.5);
        System.out.println(car);
        System.out.println(truck);
        System.out.println(bus);

        bus.startMoving();
        car.finishMoving();
    }
}
