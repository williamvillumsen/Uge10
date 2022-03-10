package com.company;

public class Car
{
    private String make;
    private String model;
    private int year;
    private String bodyStyle;
    private Driver driver;

    //Constructer
    public Car(String make, String model, int year, String bodyStyle)
    {
        this.make = make;
        this.model = model;
        this.year = year;
        this.bodyStyle = bodyStyle;
    }

    //Getter
    public Driver getDriver() {
        return driver;
    }

    //Setter
    public void setDriver(Driver driver)
    {
        this.driver = driver;
    }

    @Override
    public String toString()
    {
        return "Make: " + make + ". Model: " + model + " ("+ year + "), BodyStyle: " + bodyStyle;
    }
}
