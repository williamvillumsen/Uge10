package com.company;

public class Driver
{
    private String name;
    private int age;

    public Driver(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString()
    {
        return "Car is driven by" +name;
    }
}
