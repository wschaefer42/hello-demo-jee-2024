package org.example.hellodemo.jsp;

import java.time.LocalDate;

public class Greeter {
    public static String getGreeting() {
        var month = LocalDate.now().getMonth();
        return switch (month) {
            case JANUARY, FEBRUARY, MARCH -> "Hello to winter time";
            case APRIL, MAY, JUNE -> "Hello to spring and flowers";
            case JULY, AUGUST, SEPTEMBER -> "Hello to the greatest time";
            case OCTOBER, NOVEMBER, DECEMBER -> "Hello to the autumn";
        };
    }
}