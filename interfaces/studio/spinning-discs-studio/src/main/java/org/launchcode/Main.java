package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        CD blankCD = new CD("DOOM II");
        DVD blankDVD = new DVD("Point Break");

        // TODO: Call each CD and DVD method to verify that they work as expected.

//        blankCD.spinDisc();
//        blankDVD.spinDisc();

        blankCD.readData();
        blankCD.writeData(500);
        blankCD.readData();
//        blankCD.writeData(300);

        blankDVD.readData();
        blankDVD.writeData(1000);
        blankDVD.readData();
//        blankDVD.writeData(1000);


    }
}