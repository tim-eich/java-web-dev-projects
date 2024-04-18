package org.launchcode;

import java.util.Scanner;
public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of miles driven:");
        Float distance = input.nextFloat();

        System.out.println("Please enter the amount of gas consumed in gallons:");
        Float fuelConsumed = input.nextFloat();

        System.out.println("Your fuel economy is about " + (distance/fuelConsumed) + " miles per gallon.");
    }
}
