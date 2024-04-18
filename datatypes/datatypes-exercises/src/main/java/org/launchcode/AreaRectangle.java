package org.launchcode;
import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the rectangle's length:");
        Float length = input.nextFloat();

        System.out.println("Please enter the rectangle's width:");
        Float width =  input.nextFloat();

        System.out.println("The rectangle's area is " + length * width);
    }
}
