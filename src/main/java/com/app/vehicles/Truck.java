package com.app.vehicles;

public class Truck extends Vehicle{
    public Truck(String brand, String model, Double engineCapacity, double bestLapTime) {
        super(brand, model, engineCapacity, bestLapTime);
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
    public void printBestLapTime() {
        System.out.println("Лучшее время круга грузовика: "+ bestLapTime());
    }

    @Override
    public void printMaximumSpeed() {

    }
}
