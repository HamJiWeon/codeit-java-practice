package oop.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        // String[] arr = new String[50];
        ArrayList<String> nick = new ArrayList<>();

        nick.add("멍멍이");
        String str = "야옹이";
        nick.add(str);
        nick.add(new String("개구리"));
        nick.add("짹짹이");
        nick.add("야옹이");
        System.out.println("nick = " + nick);

        nick.add(3, "어흥이");
        System.out.println("nick = " + nick);

        System.out.println(nick.get(3));

        nick.set(2, "짹짹이");
        System.out.println("nick = " + nick);

        for (String s : nick) {
            System.out.println(s);
        }

        System.out.println(nick.contains("메뚜기"));

        System.out.println(nick.indexOf("짹짹이"));

        nick.remove("삐약이");
        nick.remove(0);
        System.out.println(nick);

        nick.clear();

        System.out.println(nick);
        System.out.println(nick.isEmpty());

        System.out.println("============================================================");

        List<Integer> score = new ArrayList<>();

        score.add(90);

        Collections.addAll(score, 78, 100, 88, 79, 100, 21, 56, 100);
        List<Integer> integerList1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> integerList2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        System.out.println("score = " + score);

        System.out.println(Collections.frequency(score, 100));

        System.out.println("최댓값: " + Collections.max(score));
        System.out.println("최솟값: " + Collections.min(score));

        score.sort((o1, o2) -> o2 - o1);

        Collections.shuffle(score);
        Collections.swap(score, 2, 7);

        System.out.println(score);
    }
}
