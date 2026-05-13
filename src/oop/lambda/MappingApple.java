package oop.lambda;

import java.util.ArrayList;
import java.util.List;

public class MappingApple {

    // 사과의 색상만 추출
    public static List<Color> mappingAppleByColor(List<Apple> apples) {
        List<Color> colors = new ArrayList<>();

        for (Apple apple : apples) {
            colors.add(apple.getColor());
        }

        return colors;
    }

    public static <T, R> List<R> map(List<T> list, GenericFunction<T, R> mapper) {
        List<R> mappedList = new ArrayList<>();

        for (T t : list) {
            R r = mapper.apply(t);
            mappedList.add(r);
        }

        return mappedList;
    }
}
