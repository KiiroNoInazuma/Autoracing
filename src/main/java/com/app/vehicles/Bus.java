package com.app.vehicles;

public class Bus extends Vehicle{
    public Bus(String brand, String model, Double engineCapacity) {
        super(brand, model, engineCapacity);
    }

    @Override
    public void startMoving() {
        System.out.printf("Автобус %s %s начал движение", getBrand(), getModel());
    }

    @Override
    public void finishMoving() {
        System.out.printf("Автобус %s %s остановился", getBrand(), getModel());
    }
}
