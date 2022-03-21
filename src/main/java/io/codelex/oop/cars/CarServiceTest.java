package io.codelex.oop.cars;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CarServiceTest {
    public static void main(String[] args) {

        Manufacturer man1 = new Manufacturer("Volkswagen", 1934, "Germany");
        List<Manufacturer> manufacturerList1 = new ArrayList<>();
        manufacturerList1.add(man1);

        Manufacturer man2 = new Manufacturer("Pagrabs", 23, "Latvia");
        Manufacturer man3 = new Manufacturer("Mini", 1980, "Austria");
        Manufacturer man4 = new Manufacturer("Something", 2001, "Italy");

        List<Manufacturer> manufacturerList2 = new ArrayList<>();
        manufacturerList2.add(man2);
        manufacturerList2.add(man3);

        manufacturerList2.add(man4);
        Car mini = new Car("Mini", "1", BigDecimal.valueOf(10029.20), 2001, manufacturerList2, EngineType.V8);
        CarService carService = new CarService();

        carService.addCar(new Car("Golf", "Mk6", BigDecimal.valueOf(1999.99), 2005, manufacturerList1, EngineType.S6));
        carService.addCar(new Car("Golf", "Mk5", BigDecimal.valueOf(999.99), 1998, manufacturerList1, EngineType.V12));
        carService.addCar(new Car("Mini", "2", BigDecimal.valueOf(2938.02), 2001, manufacturerList2, EngineType.V6));
        carService.addCar(new Car("Definitely not Mini", "1", BigDecimal.valueOf(90000.00), 1987, manufacturerList2, EngineType.V6));
        carService.addCar(new Car("Mini", "2", BigDecimal.valueOf(230.02), 2001, manufacturerList2, EngineType.S4));
        carService.addCar(mini);
        System.out.println("All cars in service:");
        carService.printAllCarsInService();

        System.out.println("===================================");
        System.out.println("Cars made before 1999");
        System.out.println(carService.getCarsBefore1999());
        System.out.println("Cars with V12 engines");
        System.out.println(carService.getCarsWithXEngine(EngineType.V12));
        System.out.println("Most expensive car");
        System.out.println(carService.getMostExpensiveCar());
        System.out.println("Cheapest car:");
        System.out.println(carService.getCheapestCar());
        System.out.println("Cars with 3 manufacturers");
        System.out.println(carService.getCarsWith3Manufacturers());

        System.out.println("===================================");
        System.out.println("Cars in service sorted by name:");
        CarService sortedCarService = new CarService(carService.sortedList());
        System.out.println(sortedCarService);

        System.out.println("===================================");
        System.out.println(carService.isTheCarHere(mini));
        System.out.println(carService.findManufacturerCars(man1));

        System.out.println("===================================");
        System.out.println(carService.listCarByManufacturerYears(SelectOperation.getOperation(">="), 1998));

    }
}
