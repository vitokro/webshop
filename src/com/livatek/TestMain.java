package com.livatek;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestMain {

    public static void main(String[] args) {
        test(new String[]{"23", "199.95", "online"}, new BigDecimal("4598.85"));
        test(new String[]{"23", "199.95", "book"}, new BigDecimal("4698.85"));
    }

    private static void test(String[] testArgs, BigDecimal expectedResult) {
        System.out.println("---------------------------------");
        System.out.println("Params: " + Arrays.toString(testArgs));
        System.out.println("Expected price: " + expectedResult.toString());
        BigDecimal totalPrice = Main.getTotalPrice(testArgs);
        System.out.println("Calculated price: " + totalPrice);
        if (!totalPrice.equals(expectedResult)) {
            System.out.println("Test failed");
        } else
            System.out.println("Test passed");

    }
}
