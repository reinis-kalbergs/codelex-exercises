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
        final int MAX_EXPRESS_WEIGHT = 15;
        final int MAX_WEIGHT = 30;
        if (parcelTooLarge()) {
            result = false;
            System.out.println("Package's dimensions can't exceed 300");
        }
        if (parcelTooSmall()) {
            System.out.println("Package's dimensions can't be smaller than 30");
            result = false;
        }
        if (isExpress && weight > MAX_EXPRESS_WEIGHT) {
            result = false;
            System.out.println("Express packages can't exceed 15 kg");
        } else if (weight > MAX_WEIGHT) {
            result = false;
            System.out.println("Packages can't exceed 30 kg");
        }
        return result;
    }

    private boolean parcelTooLarge() {
        final int MAX_LENGTH = 300;
        return (xLength > MAX_LENGTH || yLength > MAX_LENGTH || zLength > MAX_LENGTH);
    }

    private boolean parcelTooSmall() {
        final int MIN_LENGTH = 30;
        return (xLength > MIN_LENGTH || yLength > MIN_LENGTH || zLength > MIN_LENGTH);
    }

}
