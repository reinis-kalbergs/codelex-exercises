package io.codelex.oop.imperialToMetric;

import java.math.BigDecimal;

public class KilometersToMilesConverter extends UnitConverter {

    @Override
    protected BigDecimal getCoefficient() {
        return new BigDecimal("0.621371192");
    }
}
