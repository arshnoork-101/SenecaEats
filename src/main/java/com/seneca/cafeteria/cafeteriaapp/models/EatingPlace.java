package com.seneca.cafeteria.cafeteriaapp.models;

/**
 * Model class representing an eating place in the cafeteria.
 * Contains information about the place's name, operating hours, and schedule.
 */
public class EatingPlace {
    private final String name;
    private final String openTime;
    private final String closeTime;
    private final String schedule;

    public EatingPlace(String name, String openTime, String closeTime, String schedule) {
        this.name = name;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.schedule = schedule;
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

    public String getSchedule() {
        return schedule;
    }
} 