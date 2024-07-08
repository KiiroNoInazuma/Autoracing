package com.app.drivers;

import com.app.vehicles.Car;
import com.app.vehicles.Truck;

public class DriverC extends Driver<Truck>{
    public final static char LICENSE = 'C';
    public DriverC(String name, boolean driverLicense, String dataBeginExperience) {
        super(name, driverLicense, dataBeginExperience);
    }

    @Override
    public void driverStartMoving(Truck transport) {
        System.out.println(getName() + "с категорией прав " + LICENSE + " запустил двигатель");
        transport.startMoving();
    }

    @Override
    public void driverFinishMoving(Truck transport) {
        System.out.println(getName() + "с категорией прав " + LICENSE + " заглушил двигатель");
        transport.finishMoving();
    }

    @Override
    public void driverRefuelCar(Truck transport) {
        System.out.println(getName() + "с категорией прав " + LICENSE + " остановился заправиться");
        transport.carryOutMaintenance();
    }
}
