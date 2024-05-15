package org.launchcode;

public class CD extends BaseDisc{
    private final int minDiscSpeed = 200;
    private final int maxDiscSpeed = 500;
    private final double totalCapacity = 650;
    private double usedCapacity = 0;
    // TODO: Implement your custom interface.

    public CD(String discType, double capacity, int readSpeed, int writeSpeed, int minDiscSpeed, int maxDiscSpeed, double totalCapacity, String discName) {
        this.discType = discType;
        this.totalCapacity = totalCapacity;
        this.readSpeed = readSpeed;
        this.writeSpeed = writeSpeed;
        this.minDiscSpeed = minDiscSpeed;
        this.maxDiscSpeed = maxDiscSpeed;
        this.discName = discName;
    }

    @Override
    public void spinDisc() {
        System.out.println("The disc is spinning between " + this.minDiscSpeed + " and " + this.maxDiscSpeed + " RPMs.");
    }

    @Override
    public void readData() {
        System.out.println();
    }

    @Override
    public void writeData() {

    }


    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
