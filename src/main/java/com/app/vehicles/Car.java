package com.app.vehicles;

public class Car extends Vehicle{
    public Car(String brand, String model, Double engineCapacity) {
        super(brand, model, engineCapacity);
    }

    @Override
    public void startMoving() {
        System.out.printf("Автомобиль %s %s начал движение", getBrand(), getModel());
    }

    @Override
    public void finishMoving() {
        System.out.printf("Автомобиль %s %s остановился", getBrand(), getModel());
    }
}
