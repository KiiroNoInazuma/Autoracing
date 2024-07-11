package com.app.vehicles;

public class Bus extends Vehicle {

    public enum ContributionType {
        ESPECIALLY_SMALL("особо малая (до 10 мест)"),
        SMALL("малая (до 25)"),
        MIDDLE("средняя (40-50)"),
        LARGE("большая (60-80)"),
        EXTRA_LARGE("особо большая (100-120 мест)");

        private final String typeTransport;

        ContributionType(String typeTransport) {
            this.typeTransport = typeTransport;
        }
    }

    private final ContributionType bodyType;

    public Bus(String brand, String model, Double engineCapacity, ContributionType bodyType) {
        super(brand, model, engineCapacity);
        this.bodyType = bodyType;
    }

    @Override
    public void startMoving() {
        System.out.printf("Автобус %s %s начал движение\n", getBrand(), getModel());
    }

    @Override
    public void finishMoving() {
        System.out.printf("Автобус %s %s остановился\n", getBrand(), getModel());
    }

    @Override
    public void printType() {
        System.out.println(bodyType.typeTransport);
    }

    @Override
    public void goThroughDiagnostics() {
        throw new UnsupportedOperationException("Автобусы диагностику проходить не могут");
    }

    @Override
    public void carryOutMaintenance() {
        System.out.println("Автобус " + getBrand() + " обслуживается");
    }

    @Override
    public void printBestLapTime(String time) {
        System.out.println("Максимальное время автобуса: " + time + " c.");
    }

    @Override
    public void printMaximumSpeed(int speed) {
        System.out.println("Максимальное скорость автобуса: " + speed + " км/ч");
    }

}
