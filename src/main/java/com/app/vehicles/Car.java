package com.app.vehicles;

public class Car extends Vehicle {

    public Car(String brand, String model, Double engineCapacity) {
        super(brand, model, engineCapacity);
    }

    @Override
    public void startMoving() {
        System.out.printf("Автомобиль %s %s начал движение\n", getBrand(), getModel());
    }

    @Override
    public void finishMoving() {
        System.out.printf("Автомобиль %s %s остановился\n", getBrand(), getModel());
    }

    @Override
    public void carryOutMaintenance() {
        System.out.println("Автомобиль " + getBrand() + " обслуживается");
    }

    @Override
    public void printBestLapTime(String time) {
        System.out.println("Максимальное время автомобиля: " + time + " c.");
    }

    @Override
    public void printMaximumSpeed(int speed) {
        System.out.println("Максимальное скорость автомобиля: " + speed + " км/ч");
    }

}
