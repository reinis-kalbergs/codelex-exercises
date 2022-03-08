package io.codelex.classesandobjects.exercises.exercise1;

public class Exercise1 {
    public static void main(String[] args) {

        Product produkts1 = new Product("Logitech mouse", 70.00, 14);
        Product produkts2 = new Product("iPhone 5s", 999.99, 3);
        Product produkts3 = new Product("Epson EB-U05", 440.46, 1);

        System.out.println(produkts1.printProduct());
        System.out.println(produkts2.printProduct());
        System.out.println(produkts3.printProduct());

        produkts1.setAmount(4);
        produkts2.setPrice(799.99);
        System.out.println("Products after changes:");
        System.out.println(produkts1.printProduct());
        System.out.println(produkts2.printProduct());
        System.out.println(produkts3.printProduct());

    }
}
