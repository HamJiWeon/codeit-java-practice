package oop.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static oop.stream.Menu.MENU_LIST;

public class Grouping {

    public static void main(String[] args) {
        System.out.println("채식요리와 아닌 요리로 메뉴를 나눠보자");
        Map<Boolean, List<Dish>> veggie = MENU_LIST.stream()
                .collect(Collectors.partitioningBy(Dish::vegetarian));

        System.out.println("=== 채식 메뉴 ===");
        veggie.get(true).forEach(System.out::println);

        System.out.println("=== 일반 메뉴 ===");
        veggie.get(false).forEach(System.out::println);

        System.out.println();
        System.out.println("요리를 종류별로 그룹화 해줘");
        Map<Dish.Type, List<Dish>> menuType = MENU_LIST.stream()
                .collect(Collectors.groupingBy(Dish::type));

        System.out.println();
        System.out.println("=== 육류 메뉴 ===");
        menuType.get(Dish.Type.MEAT).forEach(System.out::println);

        System.out.println();
        System.out.println("종류별로 나눈 메뉴를 칼로리 기준(500 넘으면 고칼로리, 나머지 저칼로리)으로 한 번 더 그룹화 해줘");
        Map<Dish.Type, Map<String, List<Dish>>> detaildMenu = MENU_LIST.stream()
                .collect(Collectors.groupingBy(Dish::type,
                        Collectors.groupingBy(d -> d.calories() > 500 ? "고칼" : "저칼")));

        detaildMenu.get(Dish.Type.OTHER).get("고칼").forEach(System.out::println);
    }
}
