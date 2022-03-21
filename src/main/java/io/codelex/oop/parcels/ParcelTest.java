package io.codelex.oop.parcels;

public class ParcelTest {
    public static void main(String[] args) {
        Parcel[] allParcels = new Parcel[5];
        allParcels[0] = new Parcel(400, 300, 200, 20, true);
        allParcels[1] = new Parcel(20, 150, 200, 10, true);
        allParcels[2] = new Parcel(450, 150, 2, 10, false);
        allParcels[3] = new Parcel(203, 150, 190, 42, false);
        allParcels[4] = new Parcel(203, 150, 190, 23, false);

        for (int i = 0; i < allParcels.length; i++) {
            System.out.println("Parcel #" + (i + 1));
            if (allParcels[i].validate())
                System.out.println("Parcel is good to go.");
        }
    }
}
