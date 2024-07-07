package com.app.vehicles;

public class Car extends Vehicle{

    public Car(String brand, String model, Double engineCapacity, double bestLapTime) {
        super(brand, model, engineCapacity, bestLapTime);
    }

    @Override
    public void startMoving() {
        System.out.printf("\nАвтомобиль %s %s начал движение", getBrand(), getModel());
    }

    @Override
    public void finishMoving() {
        System.out.printf("\nАвтомобиль %s %s остановился", getBrand(), getModel());
    }

    @Override
    public void carryOutMaintenance() {
        System.out.println("Автомобиль обслуживается");
    }

    @Override
    public void printBestLapTime() {
        System.out.println("Лучшее время круга автомобиля: "+ bestLapTime());
    }

    @Override
    public void printMaximumSpeed() {

    }
}
