package com.app.vehicles;

public class Truck extends Vehicle{

    public enum LiftingCapacityType{
        N1("C полной массой до 3,5 тонн"),
        N2("C полной массой свыше 3,5 до 12 тонн"),
        N3("с полной массой свыше 12 тонн");

        private final String typeTransport;

        LiftingCapacityType(String typeTransport) {
            this.typeTransport = typeTransport;
        }
    }

    private final LiftingCapacityType bodyType;

    public Truck(String brand, String model, Double engineCapacity, LiftingCapacityType bodyType) {
        super(brand, model, engineCapacity);
        this.bodyType = bodyType;
    }

    @Override
    public void startMoving() {
        System.out.printf("Грузовик %s %s начал движение\n", getBrand(), getModel());
    }

    @Override
    public void finishMoving() {
        System.out.printf("Грузовик %s %s остановился\n", getBrand(), getModel());
    }

    @Override
    public void printType() {
        System.out.println(bodyType.typeTransport);
    }

    @Override
    public void goThroughDiagnostics() {
        System.out.println("Грузовик " +getBrand()+" "+getModel()+ " диагностику прошел");
    }

    @Override
    public void carryOutMaintenance() {
        System.out.println("Грузовик " + getBrand() + " обслуживается");
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
