package com.app.drivers;

import com.app.vehicles.Car;

public class DriverB extends Driver<Car> {
    public final static char LICENSE = 'B';

    public DriverB(String name, boolean driverLicense, String dataBeginExperience) {
        super(name, driverLicense, dataBeginExperience);
    }

    @Override
    public void driverStartMoving(Car transport) {
        System.out.println(getName() + " с категорией прав " + LICENSE + " запустил двигатель");
        transport.startMoving();
    }

    @Override
    public void driverFinishMoving(Car transport) {
        System.out.println(getName() + "с категорией прав " + LICENSE + " заглушил двигатель");
        transport.finishMoving();
    }

    @Override
    public void driverRefuelCar(Car transport) {
        System.out.println(getName() + "с категорией прав " + LICENSE + " остановился заправиться");
        transport.carryOutMaintenance();
    }


}
