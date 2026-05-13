package oop.stream;

// map : 리스트에서 원하는 데이터만 추출
// original : [ {}, {}, {}, {}, {} ]
// filter   : [ {}, {}, {} ]
// map      : [ "", "", "", "", "" ]

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static oop.stream.Menu.MENU_LIST;

public class Mapping {

    public static void main(String[] args) {
        System.out.println("요리 이름만 출력");
        MENU_LIST.stream()
                .map(Dish::name)
                .toList()
                .forEach(System.out::println);

        System.out.println();

        MENU_LIST.forEach(i -> System.out.println(i.name()));

        System.out.println();

        // toList(): 자바 16부터 쓸 수 있음. 불변 리스트 -> 수정 안됨!
        // collect(Collectors.toList()): 자바 8부터 존재하던 방식 -> 수정 자유로움
        List<String> list = MENU_LIST.stream()
                .map(Dish::name)
                .collect(Collectors.toList());// == .toList()

        list.add("mara");

        System.out.println(list);

        System.out.println();
        List<String> browsers = List.of("Safari", "Chrome", "MS Edge", "FireFox", "Opera");

        System.out.println(browsers.stream()
                .map(String::length)
                .toList());

        System.out.println();

        System.out.println(browsers.stream()
                .map(b -> b.toLowerCase().charAt(0))
                .toList());

        System.out.println();

        /*
         메뉴 목록에서 메뉴 이름과 칼로리만 추출해서
         새로운 객체로 포장해서 받고 싶다.
         */

        MENU_LIST.stream()
                .map(SimpleDish::new)
                .toList()
                .forEach(System.out::println);

        System.out.println();

        /*
            메뉴 목록에서 칼로리가 500칼로리보다 큰
            음식들을 필터링한 다음에 음식의 이름과 타입만
            추출해서 출력해주세요. -> DishDetail이라는 객체로 맵핑
            단, 타입은 MEAT의 경우 육류라고 저장
            FISH는 어류라고 저장, OTHER는 기타라고 저장
         */

        MENU_LIST.stream()
                .filter(d -> d.calories() > 500)
                .map(DishDetail::new)
                .toList()
                .forEach(System.out::println);

        System.out.println();
        System.out.println("메뉴 목록에 있는 요리들의 총 칼로리 구하기");
        System.out.println(MENU_LIST.stream()
                .mapToInt(Dish::calories)
                .sum());

        System.out.println();
        System.out.println("육류 메뉴의 평균 칼로리 구하기");

        System.out.printf("meatAvg = %.1f", MENU_LIST.stream()
                .filter(t -> t.type().getDesc() == "육류")
                .mapToInt(Dish::calories)
                .average()
                .getAsDouble());

        System.out.println();
        System.out.println("모든 요리 이름에 포함된 알파벳을 중복 없이 추출");
//        MENU_LIST.stream()
//                .map(d -> d.name().split(""))
//                .toList()
//                .forEach(arr -> System.out.println(Arrays.toString(arr)));

        List<String> collect = MENU_LIST.stream()
                .map(d -> d.name().split(""))
                .flatMap(arr -> Arrays.stream(arr))
                .filter(s -> !s.isBlank())
                .distinct()
                .toList();

        System.out.println(collect);
    }

}
