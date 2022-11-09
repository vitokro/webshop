package com.livatek;

import java.math.BigDecimal;

public interface BasePriceCalculator {

    BigDecimal calculate(long amount, BigDecimal price, Type type);
}
