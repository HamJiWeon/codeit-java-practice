package oop.stream;

import java.util.List;
import java.util.stream.Stream;

import static oop.stream.Dish.Type.MEAT;
import static oop.stream.Menu.MENU_LIST;

public class Filtering {

    public static void main(String[] args) {

        System.out.println("요리 메뉴 중 채식주의자가 먹을 수 있는 요리만 필터링");
        List<Dish> vegetarianDish = MENU_LIST.stream().filter(Dish::vegetarian).toList();

        vegetarianDish.forEach(d -> System.out.println(d.name()));

        System.out.println();

        System.out.println("메뉴 목록 중에 육류이면서 600칼로리 미만인 요리를 필터링해서 출력");
        MENU_LIST.stream().filter(d -> d.calories() < 600 || d.type() == MEAT).forEach(i -> System.out.println(i.name()));

        System.out.println();

        System.out.println("메뉴 목록에서 요리 이름이 4글자인 것만 필터링해서 출력");
        MENU_LIST.stream()
                .filter(d -> d.name().length() == 4)
                .toList()
                .forEach(i -> System.out.println(i.name()));

        System.out.println();

        System.out.println("칼로리가 300칼로리보다 큰 요리 중에 앞에 3개만 가져오기");
        MENU_LIST.stream()
                .filter(d -> d.calories() > 300)
                .limit(3)
                .toList()
                .forEach(s -> System.out.println(s.name()));

        System.out.println();

        System.out.println("칼로리가 300칼로리보다 큰 요리 중에 앞에 2개 제외하고 가져오기");
        MENU_LIST.stream()
                .filter(d -> d.calories() > 300)
                .skip(2)
                .toList()
                .forEach(s -> System.out.println(s.name()));

        System.out.println();

        System.out.println("리스트에서 짝수만 필터링");
        List<Integer> numbers = List.of(1, 2, 1, 3, 3, 2, 4, 4, 4, 5, 6);

        numbers.stream()
                .filter(i -> i % 2 == 0)
                .distinct()
                .toList()
                .forEach(System.out::println);
    }
}
