package org.launchcode;

public class DVD extends BaseDisc {
    // TODO: Implement your custom interface.
    private final int minDiscSpeed = 570;
    private final int maxDiscSpeed = 1600;
    private final double totalCapacity = 2048;
    private double usedCapacity = 0;
    // TODO: Implement your custom interface.

    public DVD(String discType, int minDiscSpeed, int maxDiscSpeed, double totalCapacity, String discName) {
        super(discType, minDiscSpeed, maxDiscSpeed, totalCapacity, discName);
    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    @Override
    public void spinDisc() {
        System.out.println("The disc is spinning between " + this.minDiscSpeed + " and " + this.maxDiscSpeed + " RPMs.");
    }
}
