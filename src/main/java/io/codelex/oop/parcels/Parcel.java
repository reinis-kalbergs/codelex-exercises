package io.codelex.oop.parcels;

public class Parcel implements Validatable {
    private int xLength;
    private int yLength;
    private int zLength;
    private float weight;
    private boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    @Override
    public boolean validate() {
        boolean result = true;
        if (xLength > 300 || yLength > 300 || zLength > 300) {
            result = false;
            System.out.println("Package's dimensions can't exceed 300");
        }
        if (xLength < 30 || yLength < 30 || zLength < 30) {
            System.out.println("Package's dimensions can't be smaller than 30");
            result = false;
        }
        if (isExpress && weight > 15.0) {
            result = false;
            System.out.println("Express packages can't exceed 15 kg");
        } else if (weight > 30.0) {
            result = false;
            System.out.println("Packages can't exceed 30 kg");
        }
        return result;
    }
}
