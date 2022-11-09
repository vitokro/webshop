package com.livatek;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        System.out.println(getTotalPrice(args) + " DKK");
    }

    public static BigDecimal getTotalPrice(String[] args) {
        validateParams(args);

        int amount = Integer.parseInt(args[0]);
        BigDecimal price = new BigDecimal(args[1]);
        Type type = Type.valueOf(args[2].toUpperCase());

        BasePriceCalculator calc = new BasePriceCalculatorImpl(new FreightCalculatorImpl());
        return calc.calculate(amount, price, type);
    }

    private static void validateParams(String[] args) {
        // validations
    }
}
