package io.codelex.oop.cars;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CarsTest {
    public static void main(String[] args) {
        Manufacturer VW = new Manufacturer("Volkswagen", 1934, "Germany");
        System.out.println(VW);

        List<Manufacturer> golfManuf = new ArrayList<>();
        golfManuf.add(VW);

        Car golf1 = new Car("Golf", "Mk5", BigDecimal.valueOf(1999.99), 2005, golfManuf, EngineType.S6);


    }
}
