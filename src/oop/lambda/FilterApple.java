package oop.lambda;

import java.util.ArrayList;
import java.util.List;

import static oop.lambda.Color.GREEN;

public class FilterApple {

    public static List<Apple> filterGreenApple(List<Apple> basket) {
        List<Apple> greenBasket = new ArrayList<>();

        for (Apple apple : greenBasket) {
            if (apple.getColor() == GREEN) {
                greenBasket.add(apple);
            }
        }

        return greenBasket;
    }
}
