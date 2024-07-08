package com.app.drivers;

import com.app.vehicles.Vehicle;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static java.util.Objects.isNull;

public abstract class Driver<T extends Vehicle> {
    private final String name;
    private final boolean driverLicense;
    private final Integer drivingExperience;

    protected Driver(String name, boolean driverLicense, String dataBeginExperience) {
        this.name = propertiesValidate(name);
        this.driverLicense = driverLicense;
        this.drivingExperience = calcDrivingExperience(dataBeginExperience);
    }


    public abstract void driverStartMoving(T transport);

    public abstract void driverFinishMoving(T transport);

    public abstract void driverRefuelCar(T transport);


    private String propertiesValidate(String value) {
        if (isNull(value) || value.isBlank()) {
            throw new IllegalArgumentException("Ошибка данных! Некорректная водителя");
        }
        return value;
    }

    private Integer calcDrivingExperience(String dataBeginExp) {
        return LocalDate.now().getYear() - LocalDate.parse(propertiesValidate(dataBeginExp),
                DateTimeFormatter.ofPattern("dd.MM.yyyy")).getYear();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", driverLicense=" + driverLicense +
                ", drivingExperience=" + drivingExperience +
                '}';
    }
}
