package io.codelex.oop.computers;

public class ComputerTest {
    public static void main(String[] args) {
        Computer computer = new Computer("Intel i5", "8GB", "Nvidia test", "Lenovo", "Desktop");
        System.out.println(computer);
        System.out.println(computer.hashCode());
        System.out.println(computer.equals(computer));
        computer.setCompany("Company2");
        computer.setGraphicsCard("Intel integrated");
        System.out.println(computer.getCompany() + " " + computer.getGraphicsCard());

        Laptop definitelyNotMyLaptop = new Laptop("Intel i5", "8 GB", "Nvidia something", "Lenovo", "Legion", "Not good");
        Laptop laptop2 = new Laptop("AMD", "72 KB", "Some graphics card", "Lenovo", "Old", "Also not good");
        System.out.println(definitelyNotMyLaptop.equals(laptop2));
        System.out.println(laptop2.getGraphicsCard());
    }
}
