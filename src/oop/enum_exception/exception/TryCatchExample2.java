package oop.enum_exception.exception;


import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchExample2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            int[] arr = new int[5];

            System.out.print("정수: ");
            int n = sc.nextInt(); // InputMismatchException

            int result = 100 / n; // ArithmeticException

            System.out.println(arr[result]); // ArrayIndexOutOfBoundsException

            String s = null; // NullPointerException

            s.equals("메롱");
        } catch (InputMismatchException | ArithmeticException e) {
            System.out.print("입력 값이 잘못 되었습니다.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("인덱스 범위를 벗어났어요.");
        } catch (NullPointerException e) {
            System.out.print("객체의 주소 대신에 null을 참조하면 안됩니다.");
        } finally {
            System.out.println(" 바보야");
            sc.close();
        }
    }
}
