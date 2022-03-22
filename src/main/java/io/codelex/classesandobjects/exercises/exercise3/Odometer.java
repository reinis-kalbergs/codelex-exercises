package io.codelex.classesandobjects.exercises.exercise3;

public class Odometer {
    private int mileage;

    public Odometer(int mileage) {
        this.mileage = mileage;
    }

    public Odometer() {
        this(0);
    }

    public int getMileage() {
        return mileage;
    }

    @Override
    public String toString() {
        return "Odometer shows " + mileage +
                " kilometers";
    }

    public void odometerIncrement() {
        int MAX_ODOMETER_VALUE = 999999;
        if (mileage == MAX_ODOMETER_VALUE) {
            mileage = 0;
        } else {
            mileage++;
        }
    }

    public void driveFor(FuelGauge curFuelGauge, int kmDriven) {

        if (!curFuelGauge.isEmpty()) {
            for (int i = 0; i < kmDriven; i++) {
                odometerIncrement();
                if (mileage % 10 == 0) {
                    curFuelGauge.burnFuel();
                }
                if (curFuelGauge.isEmpty()) {
                    System.out.println("You ran out of fuel!");
                    break;
                }
            }
        } else {
            System.out.println("Can't drive, you haven't got any fuel.");
        }
    }

    public void justDrive(FuelGauge curFuelGauge) {//drive for 1km
        if (curFuelGauge.isEmpty()) {
            System.out.println("Can't drive, you haven't got any fuel.");
        } else {
            odometerIncrement();
            if (mileage % 10 == 0) {
                curFuelGauge.burnFuel();
            }
        }
    }

}
