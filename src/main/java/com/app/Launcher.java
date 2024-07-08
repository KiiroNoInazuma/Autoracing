package com.app;

import com.app.drivers.Driver;
import com.app.drivers.DriverB;
import com.app.drivers.DriverC;
import com.app.drivers.DriverD;
import com.app.vehicles.Bus;
import com.app.vehicles.Car;
import com.app.vehicles.Truck;

public class Launcher {

    public static void main(String[] args) {

        Car car = new Car("Audi", "A4", 2.5);
        Truck truck = new Truck("Volvo", "FH", 12.8);
        Bus bus = new Bus("MAN", "Lion", 10.5);

        Driver<Car> driver1 = new DriverB("Женя", true, "23.08.2012");
        Driver<Truck> driver2 = new DriverC("Дмитрий", true, "23.08.2011");
        Driver<Bus> driver3 = new DriverD("Вадим", true, "23.08.2010");

        driver1.driverStartMoving(car);
        driver1.driverFinishMoving(car);
        driver1.driverRefuelCar(car);
        System.out.println();
        driver2.driverStartMoving(truck);
        driver2.driverFinishMoving(truck);
        driver2.driverRefuelCar(truck);
        System.out.println();
        driver3.driverStartMoving(bus);
        driver3.driverFinishMoving(bus);
        driver3.driverRefuelCar(bus);


    }
}
