package io.codelex.oop.imperialToMetric;

import java.math.BigDecimal;

public class YardsToMetersConverter extends UnitConverter {


    @Override
    protected BigDecimal getCoefficient() {
        return new BigDecimal("0.9144");
    }
}
