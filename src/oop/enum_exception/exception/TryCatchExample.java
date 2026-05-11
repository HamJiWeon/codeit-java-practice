package oop.enum_exception.exception;


public class TryCatchExample {

    public static void main(String[] args) {


        try {
            int i = 20, j = 0;

            System.out.println(i + " / " + j + " = " + (i / j));
        } catch (Exception e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }
        System.out.println("프로그램 정상 종료");
    }

}
