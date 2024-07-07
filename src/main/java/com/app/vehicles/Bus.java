package com.app.vehicles;

public class Bus extends Vehicle{
    public Bus(String brand, String model, Double engineCapacity, double bestLapTime, int maxSpeed) {
        super(brand, model, engineCapacity, bestLapTime, maxSpeed);
    }

    @Override
    public void startMoving() {
        System.out.printf("\nАвтобус %s %s начал движение", getBrand(), getModel());
    }

    @Override
    public void finishMoving() {
        System.out.printf("\nАвтобус %s %s остановился", getBrand(), getModel());
    }

    @Override
    public void carryOutMaintenance() {
        System.out.println("Автобус обслуживается");
    }

    @Override
    public void printBestLapTime() {
        System.out.println("Лучшее время круга автобуса: "+ showBestLapTime());
    }

    @Override
    public void printMaximumSpeed() {
        System.out.println("Максимально скорость автобуса: "+ showMaxSpeed());
    }
}
