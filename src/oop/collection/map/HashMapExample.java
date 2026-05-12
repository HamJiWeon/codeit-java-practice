package oop.collection.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        /*
        # Map
        - Key / Value가 한 세트를 이루는 자료구조
        - Key값을 통해 Value를 참조하는 방식 (인덱스 x)
        - Key는 중복 저장을 허용하지 않는다.
        */

        // Map은 Key, Value 쌍을 이루기 때문에 멀티 제네릭을 선언.

        Map<String, String> map = new HashMap<>();

        map.put("멍멍이", "홍길동");
        map.put("야옹이", "김철수");
        map.put("짹짹이", "박영희");

        System.out.println("map = " + map);

        for (String s : map.keySet()) {
            System.out.println(s);
        }

        System.out.println("============================");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry);
        }

        map.remove("야옹이");
        System.out.println("map = " + map);

        map.clear();
    }
}
