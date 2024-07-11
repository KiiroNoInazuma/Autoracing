package com.app.drivers;

import com.app.exceptions.IncorrectDriverLicenseException;
import com.app.vehicles.Vehicle;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static java.util.Objects.isNull;

public abstract class Driver<T extends Vehicle> {
    private final String name;
    private final Boolean driverLicense;
    private final Integer drivingExperience;

    protected Driver(String name, Boolean driverLicense, String dataBeginExperience) {
        this.name = propertiesValidate(name);
        this.driverLicense = wrapperCheckDriverLicense(driverLicense);
        this.drivingExperience = calcDrivingExperience(dataBeginExperience);
    }

    public String getName() {
        return name;
    }

    protected abstract void driverStartMoving(T transport);

    protected abstract void driverFinishMoving(T transport);

    protected abstract void driverRefuelCar(T transport);

    private Boolean wrapperCheckDriverLicense(Boolean driverLicense){
        try{
            checkDriverLicense(driverLicense);
        } catch (IncorrectDriverLicenseException e) {
            throw new RuntimeException(e);
        }
        return false;
    }


    private void checkDriverLicense(Boolean driverLicense) throws IncorrectDriverLicenseException {
        if (isNull(driverLicense) || !driverLicense) {
            throw new IncorrectDriverLicenseException("У водителя нет прав! Нет допуска к управлению ТС");
        }
    }


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


}
