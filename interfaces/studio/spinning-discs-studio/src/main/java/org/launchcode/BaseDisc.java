package org.launchcode;

public abstract class BaseDisc implements OpticalDisc{

    private final int readSpeed;
    private final int writeSpeed;
    private final int minDiscSpeed;
    private final int maxDiscSpeed;
    private final double totalCapacity;
    private double usedCapacity = 0;
    private String discName;
    private final String discType;

    public BaseDisc(String discType, double capacity, int readSpeed, int writeSpeed, int minDiscSpeed, int maxDiscSpeed, double totalCapacity, String discName) {
        this.discType = discType;
        this.totalCapacity = totalCapacity;
        this.readSpeed = readSpeed;
        this.writeSpeed = writeSpeed;
        this.minDiscSpeed = minDiscSpeed;
        this.maxDiscSpeed = maxDiscSpeed;
        this.discName = discName;
    }

    public void writeData(double data) {
        if (data > this.getAvailableSpace()) {
            System.out.println("There is not enough space on this disc!");
        } else {
            this.setUsedCapacity(data);
            System.out.println("Your data has been written to the disc. Capacity remaining: " + this.getAvailableSpace());
        }
    }

    public void setUsedCapacity(double data) {
        this.usedCapacity += data;
    }

    public void setDiscName(String discName) {
        this.discName = discName;
    }

    public int getReadSpeed() {
        return readSpeed;
    }

    public int getWriteSpeed() {
        return writeSpeed;
    }

    public int getMinDiscSpeed() {
        return minDiscSpeed;
    }

    public int getMaxDiscSpeed() {
        return maxDiscSpeed;
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
