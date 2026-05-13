package oop.stream;

import oop.stream.Dish.Type;

import java.util.List;

import static oop.stream.Dish.Type.*;

public class Menu {

    public static final List<Dish> MENU_LIST;

    // 정적 초기화자(Static Initializer)
    // static field를 초기화 하는 용도로 사용 가능
    static {
        MENU_LIST = List.of(
                new Dish("pork", false, 800, MEAT),
                new Dish("beef", false, 700, MEAT),
                new Dish("chicken", false, 400, MEAT),
                new Dish("french fries", true, 530, OTHER),
                new Dish("rice", true, 350, OTHER),
                new Dish("season fruit", true, 120, OTHER),
                new Dish("pizza", true, 550, OTHER),
                new Dish("prawns", false, 400, FISH),
                new Dish("salmon", false, 450, FISH)
        );
    }
}
