package com.app;

import com.app.drivers.Driver;
import com.app.drivers.DriverB;
import com.app.vehicles.Bus;
import com.app.vehicles.Car;
import com.app.vehicles.Truck;
import com.app.vehicles.Vehicle;

public class Launcher {
    public static char s;

    public static void main(String[] args) {

        Car car = new Car("Audi", "A4", 2.5);
        Vehicle truck = new Truck("Volvo", "FH", 12.8);
        Vehicle bus = new Bus("MAN", "Lion", 10.5);

        Driver<Car> driver = new DriverB("Женя", true, "23.08.2012");
        driver.driverStartMoving(car);
    }
}
