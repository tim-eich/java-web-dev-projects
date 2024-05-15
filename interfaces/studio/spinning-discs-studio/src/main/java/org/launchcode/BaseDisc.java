package org.launchcode;

public abstract class BaseDisc implements OpticalDisc{

    private final double totalCapacity;
    private double usedCapacity = 0;
    private String discName;
    private final String discType;

    public BaseDisc(String discType, int minDiscSpeed, int maxDiscSpeed, double totalCapacity, String discName) {
        this.discType = discType;
        this.totalCapacity = totalCapacity;
        this.discName = discName;
    }

    @Override
    public void writeData(double data) {
        if (data > this.getAvailableSpace()) {
            System.out.println("There is not enough space on this disc!");
        } else {
            this.setUsedCapacity(data);
            System.out.println("Your data has been written to the disc. Capacity remaining: " + this.getAvailableSpace());
        }
    }

    @Override
    public void readData() {
        System.out.println("There is " + this.getUsedCapacity() + "MB stored in the disc.");
    }

    public void setUsedCapacity(double data) {
        this.usedCapacity += data;
    }

    public void setDiscName(String discName) {
        this.discName = discName;
    }

    public String getDiscName() {
        return discName;
    }

    public String getDiscType() {
        return discType;
    }

    public double getUsedCapacity() {
        return usedCapacity;
    }

    public double getTotalCapacity() {
        return totalCapacity;
    }

    public double getAvailableSpace() {
        return totalCapacity - usedCapacity;
    }
}
