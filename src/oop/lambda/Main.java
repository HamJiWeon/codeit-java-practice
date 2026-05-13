package oop.lambda;

import java.util.List;

import static oop.lambda.Color.*;

public class Main {

    public static void main(String[] args) {
        // 사과 바구니 생성
        // List.of -> 고정형 리스트 생성 (Arrays.asList와 유사)
        List<Apple> appleBasket = List.of(
                new Apple(80, GREEN),
                new Apple(155, GREEN),
                new Apple(120, RED),
                new Apple(97, RED),
                new Apple(200, GREEN),
                new Apple(50, RED),
                new Apple(85, YELLOW),
                new Apple(75, YELLOW)
        );

        System.out.println("========== 녹색 사과만 필터링 ==========");

        List<Apple> greenApples = FilterApple.filterGreenApple(appleBasket);
        for (Apple greenApple : greenApples) {
            System.out.println(greenApple);
        }

        System.out.println();
        System.out.println("========== 원하는 색상의 사과만 필터링 ==========");

        List<Apple> apples = FilterApple.filterAppleByColor(appleBasket, RED);
        for (Apple apple : apples) {
            System.out.println(apple);
        }

        System.out.println();
        System.out.println("========================================");
        List<Apple> lightApples = FilterApple.filterApple(appleBasket, new LightApplePredicate());

        for (Apple apple : lightApples) {
            System.out.println(apple);
        }

        System.out.println();
        System.out.println("========================================");

        List<Apple> wantedApples = FilterApple.filterApple(appleBasket,
                apple -> apple.getColor() == RED || apple.getColor() == YELLOW);

        for (Apple apple : wantedApples) {
            System.out.println(apple);
        }

        System.out.println();
        System.out.println("========================================");

        // 녹색이면서 100g 이하인 사과만 필터링
        // 우리는 이제 익명클래스를 통해, 새 클래스 파일 생성 없이 즉석에서 보낼 수 있다!
        // 근데... 어짜피 인터페이스에 추상메서드 하나 아니냐?
        // 그럼 이름을 굳이 언급할 필요 있나? -> 람다식 쓰자!

        List<Apple> wantedApple2 = FilterApple.filterApple(appleBasket,
                a -> a.getColor() == GREEN && a.getWeight() <= 100);

        for (Apple apple : wantedApple2) {
            System.out.println(apple);
        }

        System.out.println();
        System.out.println("========================================");

        // 빨강 혹은 초록, 150 미만
        List<Apple> appleList = FilterApple.filterApple(appleBasket,
                a -> a.getWeight() > 150 && (a.getColor() == RED || a.getColor() == GREEN));

        for (Apple apple : appleList) {
            System.out.println(apple);
        }

        System.out.println();
        System.out.println("========================================");

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> filter1 = FilterApple.filter(numbers, n -> n % 2 == 0);

        System.out.println("filter1 = " + filter1);

        List<String> foods = List.of("짜장면", "짬뽕", "탕수육", "피자", "삼겹살", "파스타");
        List<String> filter2 = FilterApple.filter(foods, f -> f.length() == 3);

        System.out.println("filter2 = " + filter2);

        System.out.println();
        System.out.println("========================================");

        List<Color> colorList = MappingApple.mappingAppleByColor(appleBasket);
        System.out.println(colorList);

        List<Integer> map1 = MappingApple.map(appleBasket, apple -> apple.getWeight());
        System.out.println("map1 = " + map1) ;

        List<Integer> map2 = MappingApple.map(numbers, i -> (int) Math.pow(i, 2));
        System.out.println("map2 = " + map2);

        List<Character> map3 = MappingApple.map(foods, food -> food.charAt(0));
        System.out.println("map3 = " + map3);
    }
}
