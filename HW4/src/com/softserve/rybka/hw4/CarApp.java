package com.softserve.rybka.hw4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CarApp {
    public static void main(String[] args) throws IOException {
        Car car1 = new Car("hatchback", 2008, 1000);
        Car car2 = new Car("family car", 2005, 1500);
        Car car3 = new Car("wagon", 2000, 1900);
        Car car4 = new Car("sport car", 2015, 2500);

        Car[] cars = {car1, car2, car3,car4};

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the year:");
        int year = Integer.parseInt(bufferedReader.readLine());

        for (Car car : cars){
            if (year == car.getYear()) {
                System.out.println(car.getType() + "\t" + car.getEngineCapacity() + "\t" + car.getYear());
            }
        }

        Car tmp;
        for (int i = 0; i < cars.length-1; i++) {
            for (int j = i+1; j < cars.length; j++) {
                if (cars[i].getYear() < cars[j].getYear()) {
                    tmp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(cars));
    }
}
