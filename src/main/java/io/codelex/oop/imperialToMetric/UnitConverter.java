package io.codelex.oop.imperialToMetric;

import java.math.BigDecimal;

public abstract class UnitConverter implements Converter {

    public BigDecimal convertValue(BigDecimal value) {
        return value.multiply(getCoefficient());
    }

    protected abstract BigDecimal getCoefficient();

}
