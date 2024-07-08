package com.app.drivers;

import com.app.vehicles.Bus;

public class DriverD extends Driver<Bus>{
    public final static char LICENSE = 'D';
    public DriverD(String name, boolean driverLicense, String dataBeginExperience) {
        super(name, driverLicense, dataBeginExperience);
    }

    @Override
    public void driverStartMoving(Bus transport) {
        System.out.println(getName() + " с категорией прав " + LICENSE + " запустил двигатель");
        transport.startMoving();
    }

    @Override
    public void driverFinishMoving(Bus transport) {
        System.out.println(getName() + " с категорией прав " + LICENSE + " заглушил двигатель");
        transport.finishMoving();
    }

    @Override
    public void driverRefuelCar(Bus transport) {
        System.out.println(getName() + " с категорией прав " + LICENSE + " остановился заправиться");
        transport.carryOutMaintenance();
    }
}
