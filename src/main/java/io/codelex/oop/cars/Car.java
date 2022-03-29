package io.codelex.oop.cars;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Car {
    private String name;
    private final String model;
    private BigDecimal price;
    private final int yearOfManufacture;
    private List<Manufacturer> manufacturerList = new ArrayList<>();
    private final EngineType engine;

    public Car(String name, String model, BigDecimal price, int yearOfManufacture, List<Manufacturer> manufacturerList, EngineType engine) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;
        this.manufacturerList = manufacturerList;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public List<Manufacturer> getManufacturerList() {
        return manufacturerList;
    }

    public EngineType getEngine() {
        return engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearOfManufacture == car.yearOfManufacture && Objects.equals(name, car.name)
                && Objects.equals(model, car.model) && Objects.equals(price, car.price)
                && Objects.equals(manufacturerList, car.manufacturerList) && engine == car.engine;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, yearOfManufacture, manufacturerList, engine);
    }

    @Override
    public String toString() {
        return '{' + name + ' ' + model + ' ' +
                ", price " + price +
                ", year " + yearOfManufacture +
                manufacturerNamesToString() +
                ", engine=" + engine +
                '}';
    }

    private String manufacturerNamesToString() {
        StringBuilder names = new StringBuilder(" ");
        for (Manufacturer manufacturer : manufacturerList) {
            names.append(manufacturer.getName()).append(", ");
        }
        return " manufacturer list [" + names.substring(0, names.length() - 2) + " ]";
    }

    public boolean containsManufacturer(Manufacturer manufacturer) {
        return manufacturerList.contains(manufacturer);
    }
}
