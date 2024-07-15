package com.app;

import com.app.drivers.Driver;
import com.app.drivers.DriverB;
import com.app.drivers.DriverC;
import com.app.drivers.DriverD;
import com.app.vehicles.Bus;
import com.app.vehicles.Car;
import com.app.vehicles.Truck;
import com.app.vehicles.Vehicle;

import java.util.*;

public class Launcher {

    public static void main(String[] args) {

        Car car = new Car("Audi", "A4", 2.5, Car.BodyType.CROSSOVER);
        Truck truck = new Truck("Volvo", "FH", 12.8, Truck.LiftingCapacityType.N1);
        Bus bus = new Bus("MAN", "Lion", 10.5, Bus.ContributionType.LARGE);

        Driver<Car> driver1 = new DriverB("Женя", true, "23.08.2012");
        Driver<Truck> driver2 = new DriverC("Дмитрий", true, "23.08.2011");
        Driver<Bus> driver3 = new DriverD("Вадим", true, "23.08.2010");


        Set<Driver<? extends Vehicle>> drivers = new HashSet<>();
        drivers.add(driver1);
        drivers.add(driver2);
        drivers.add(driver3);
        drivers.add(driver3);

        Iterator<Driver<? extends Vehicle>> iterator = drivers.iterator();


        List<Vehicle>vehicleList = new ArrayList<>();


    }

}

