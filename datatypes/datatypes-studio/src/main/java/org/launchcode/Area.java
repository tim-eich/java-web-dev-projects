package org.launchcode;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a radius:");
        Double radius = input.nextDouble();

        System.out.println("The area of a circle with a radius of " + radius + " is " + Math.PI * radius * radius);
    }
}
