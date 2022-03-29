package io.codelex.oop.cars;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CarService {
    private List<Car> carsInService = new ArrayList<>();

    public CarService() {
    }

    public CarService(List<Car> carsInService) {
        this.carsInService = carsInService;
    }

    public void addCar(Car car) {
        carsInService.add(car);
    }

    public void removeCar(Car carToRemove) {
        if (!carsInService.remove(carToRemove)) {
            System.out.println("No such car found.");
        }
    }

    public List<Car> getCarsInService() {
        return carsInService;
    }

    public void printAllCarsInService() {
        for (Car car : carsInService) {
            System.out.println(car);
        }
    }

    public List<Car> getCarsWithXEngine(EngineType engine) {
        List<Car> result = new ArrayList<>();
        for (Car car : carsInService) {
            if (car.getEngine() == engine)
                result.add(car);
        }
        return result;
    }

    public List<Car> getCarsBeforeXYear(int year) {
        List<Car> result = new ArrayList<>();
        for (Car car : carsInService) {
            if (car.getYearOfManufacture() < year)
                result.add(car);
        }
        return result;
    }

    public List<Car> getCarsWith3Manufacturers() {
        List<Car> result = new ArrayList<>();
        for (Car car : carsInService) {
            if (car.getManufacturerList().size() >= 3)
                result.add(car);
        }
        return result;
    }

    public Car getMostExpensiveCar() {
        if (!checkIfEmpty()) {
            BigDecimal maxPrice = carsInService.get(0).getPrice();
            Car mostExpensiveCar = carsInService.get(0);
            for (Car car : carsInService) {
                if (car.getPrice().compareTo(maxPrice) > 0) {
                    maxPrice = car.getPrice();
                    mostExpensiveCar = car;
                }
            }
            return mostExpensiveCar;
        } else {
            return null;
        }
    }

    public Car getCheapestCar() {
        if (!checkIfEmpty()) {
            BigDecimal minPrice = carsInService.get(0).getPrice();
            Car leastExpensiveCar = carsInService.get(0);
            for (Car car : carsInService) {
                if (car.getPrice().compareTo(minPrice) < 0) {
                    minPrice = car.getPrice();
                    leastExpensiveCar = car;
                }
            }
            return leastExpensiveCar;
        } else {
            return null;
        }
    }

    private boolean checkIfEmpty() {
        if (carsInService.isEmpty()) {
            System.out.println("No cars currently in service");
            return true;
        } else {
            return false;
        }
    }

    public List<Car> sortedList() {
        List<Car> result = new ArrayList<>(carsInService);
        result.sort(Comparator.comparing(Car::getName).thenComparing(Car::getModel).thenComparing(Car::getPrice));
        return result;
        //((o1, o2) -> o1.getName().compareTo(o2.getName()));
    }

    public boolean isTheCarHere(Car car) {
        return carsInService.contains(car);
    }

    public List<Car> findManufacturerCars(Manufacturer manufacturer) {
        List<Car> result = new ArrayList<>();
        for (Car car : carsInService) {
            if (car.containsManufacturer(manufacturer)) {
                result.add(car);
            }
        }
        return result;
    }

    public List<Car> listCarByManufacturerYears(SelectOperation operation, int selectedYear) {
        List<Car> result = new ArrayList<>();
        for (Car car : carsInService) {
            boolean correct = true;
            loop:
            for (Manufacturer manufacturer : car.getManufacturerList()) {
                int year = manufacturer.getYearOfEstablishment();
                switch (operation) {
                    case LESS_THAN -> {
                        if (year < selectedYear) {
                            correct = false;
                            break loop;
                        }
                    }
                    case LESS_OR_EQUAL -> {
                        if (year <= selectedYear) {
                            correct = false;
                            break loop;
                        }
                    }
                    case GREATER_THAN -> {
                        if (year > selectedYear) {
                            correct = false;
                            break loop;
                        }
                    }
                    case GREATER_OR_EQUAL -> {
                        if (year >= selectedYear) {
                            correct = false;
                            break loop;
                        }
                    }
                    case EQUALS -> {
                        if (year == selectedYear) {
                            correct = false;
                            break loop;
                        }
                    }
                    case DOES_NOT_EQUAL -> {
                        if (year != selectedYear) {
                            correct = false;
                            break loop;
                        }
                    }
                }
            }
            if (correct) {
                result.add(car);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Car car : carsInService) {
            result.append(car).append("\n");
        }
        return "Cars in service:\n" + result;
    }
}
