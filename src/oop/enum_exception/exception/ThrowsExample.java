package oop.enum_exception.exception;

public class ThrowsExample {

    static String[] greetings = {"안녕", "Hello", "Nǐ Hǎo"};

    static void greet(int idx) throws Exception {
        System.out.println(greetings[idx]);
    }

    public static void main(String[] args) {

        try {
            greet(2);
        } catch (Exception e) {
            System.out.println("인덱스 범위 벗어남");
        }

    }
}
