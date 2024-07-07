package com.app.vehicles;

import com.app.stat.Competitive;

import java.util.Objects;

import static java.util.Objects.isNull;

public abstract class Vehicle implements Competitive {
    private final String brand;
    private final String model;
    private final Double engineCapacity;
    private double bestLapTime;
    private int maxSpeed;

    public Vehicle(String brand, String model, Double engineCapacity, double bestLapTime, int maxSpeed) {
        this.brand = propertiesValidate(brand);
        this.model = propertiesValidate(model);
        this.engineCapacity = propertiesValidate(engineCapacity);
        this.bestLapTime = bestLapTime;
        this.maxSpeed = maxSpeed;
    }

    public abstract void startMoving();

    public abstract void finishMoving();

    private String propertiesValidate(String value) {
        if (isNull(value) || value.isBlank()) {
            throw new IllegalArgumentException("Ошибка данных! Некорректная марка или модель ТС");
        }
        return value;
    }

    private Double propertiesValidate(Double value) {
        if (isNull(value) || value <= 0) {
            throw new IllegalArgumentException("Ошибка данных! Некорректный объём двигателя");
        }
        return value;
    }

    protected String getBrand() {
        return brand;
    }

    protected String getModel() {
        return model;
    }
    protected double showBestLapTime() {
        return bestLapTime;
    }

    public void setBestLapTime(double bestLapTime) {
        this.bestLapTime = bestLapTime;
    }

    protected int showMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    private String checkVehicle() {
        String car = "Car";
        String truck = "Truck";
        String nameClass = this.getClass().getSimpleName();

        return Objects.equals(car, nameClass) ? "Автомобиль" : Objects.equals(truck, nameClass) ? "Грузовик" : "Автобус";
    }

    @Override
    public String toString() {
        return String.format("\n--%s-- \nМарка: %s\nМодель: %s\nОбъем двигателя: %s",
                checkVehicle(), brand, model, engineCapacity);
    }
}
