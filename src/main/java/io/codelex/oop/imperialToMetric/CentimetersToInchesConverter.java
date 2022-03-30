package io.codelex.oop.imperialToMetric;

import java.math.BigDecimal;

public class CentimetersToInchesConverter extends UnitConverter {
    @Override
    protected BigDecimal getCoefficient() {
        return new BigDecimal("0.393700787");
    }
}
