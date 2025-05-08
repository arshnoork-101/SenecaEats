package com.seneca.cafeteria.cafeteriaapp.controllers;

public class EatingPlace {
    private String name;
    private String openTime;
    private String closeTime;
    private String hoursOfOperation;

    public EatingPlace(String name, String openTime, String closeTime, String hoursOfOperation) {
        this.name = name;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.hoursOfOperation = hoursOfOperation;
    }

    public String getName() {
        return name;
    }

    public String getOpenTime() {
        return openTime;
    }

    public String getCloseTime() {
        return closeTime;
    }

    public String getHoursOfOperation() {
        return hoursOfOperation;
    }
}
