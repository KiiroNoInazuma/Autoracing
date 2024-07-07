package com.app;

import com.app.stat.Competitive;
import com.app.vehicles.Bus;
import com.app.vehicles.Car;
import com.app.vehicles.Truck;

public class Launcher {
    public static void main(String[] args) {
        Competitive car = new Car("Audi", "A4", 2.5, 12.3, 300);
        Competitive truck = new Truck("Volvo", "FH", 12.8, 13.3, 200);
        Competitive bus = new Bus("MAN", "Lion", 10.5, 14.1, 100);

        bus.printMaximumSpeed();

    }
}
