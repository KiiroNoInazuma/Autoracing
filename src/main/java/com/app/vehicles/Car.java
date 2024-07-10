package com.app.vehicles;

public class Car extends Vehicle {

    public enum BodyType {
        SEDAN("Cедан"),
        HATCHBACK("Хетчбек"),
        COUPE("Купе"),
        WAGON("Универсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");

        private final String typeTransport;

        BodyType(String typeTransport) {
            this.typeTransport = typeTransport;
        }
    }

    private final BodyType bodyType;

    public Car(String brand, String model, Double engineCapacity, BodyType bodyType) {
        super(brand, model, engineCapacity);
        this.bodyType = bodyType;
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
    public void printType() {
        System.out.println(bodyType.typeTransport);
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
