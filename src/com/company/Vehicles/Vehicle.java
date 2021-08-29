package com.company.Vehicles;

public abstract class Vehicle {
    private int maxSpeed;
    private int power;
    private int accelerationRate;
    private int brakingAbility;
    private String type;


    public Vehicle(int maxSpeed, int power, int accelerationRate, int brakingAbility, String type) {
        this.maxSpeed = maxSpeed;
        this.power = power;
        this.accelerationRate = accelerationRate;
        this.brakingAbility = brakingAbility;
        this.type = type;

    }

    public abstract void start();
    public abstract void turnOff();
    public abstract void accelerate();
    public abstract void coast();
    public abstract void brake();

    public abstract String toString();

    public int getMaxSpeed() {
        return maxSpeed;
    }


    public int getPower() {
        return power;
    }

    public int getAccelerationRate() {
        return accelerationRate;
    }

    public int getBrakingAbility() {
        return brakingAbility;
    }

    public String getType() {
        return type;
    }


}
