package com.app.vehicles;

public class Truck extends Vehicle{
    public Truck(String brand, String model, Double engineCapacity) {
        super(brand, model, engineCapacity);
    }

    @Override
    public void startMoving() {
        System.out.printf("\nГрузовик %s %s начал движение", getBrand(), getModel());
    }

    @Override
    public void finishMoving() {
        System.out.printf("\nГрузовик %s %s остановился", getBrand(), getModel());
    }

    @Override
    public void carryOutMaintenance() {
        System.out.println("Грузовик обслуживается");
    }

    @Override
    public void printBestLapTime(String time) {
        System.out.println("Максимальное время грузовика: " + time + " c.");
    }

    @Override
    public void printMaximumSpeed(int speed) {
        System.out.println("Максимальное скорость грузовика: " + speed + " км/ч");
    }
}
