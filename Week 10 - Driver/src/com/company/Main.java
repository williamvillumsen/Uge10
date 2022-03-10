package com.company;

public class Main {

    public static void main(String[] args)
    {
	    Driver theDriver = new Driver(" William", 23);

        Car thisCar = new Car("Ferrari", "Cool", 2022, "Sporty");

        Car theCar = new Car("Fiat", "Not Cool", 1800, "Passenger");

        thisCar.setDriver(theDriver);

        theCar.setDriver(theDriver);

        System.out.println(theCar);
        System.out.println(theDriver);

        System.out.println(thisCar);
        System.out.println(theDriver);
    }

}
