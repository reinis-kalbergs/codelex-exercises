package io.codelex.oop.imperialToMetric;

import java.math.BigDecimal;

public class MilesToKilometersConverter extends UnitConverter {
    @Override
    protected BigDecimal getCoefficient() {
        return new BigDecimal("1.609344");
    }
}
