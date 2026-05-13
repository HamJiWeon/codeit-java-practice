package oop.stream;

import java.util.Comparator;

import static java.util.Comparator.*;
import static oop.stream.Menu.MENU_LIST;

public class Sorting {

    public static void main(String[] args) {

        System.out.println("육류 요리 중 칼로리가 낮은 순으로 정렬");
        MENU_LIST.stream()
                .filter(d -> d.type() == Dish.Type.MEAT)
                .sorted(comparingInt(Dish::calories))
                .toList()
                .forEach(System.out::println);

        System.out.println();
        System.out.println("전체 메뉴들을 이름 내림차순으로 정렬");
        MENU_LIST.stream()
                .sorted(comparing(Dish::name).reversed())
                .forEach(System.out::println);

        System.out.println();
        System.out.println("300칼로리 이상인 요리 중 칼로리가 낮은 Top3 요리를 필터링");
        MENU_LIST.stream()
                .filter(c -> c.calories() > 300)
                .sorted(comparing(Dish::calories).thenComparing(Dish::name, reverseOrder()))
                .limit(3)
                .forEach(System.out::println);
    }
}
