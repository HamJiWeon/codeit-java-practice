package basic.loop;

public class WhileExample {

    public static void main(String[] args) {
        int idx = 0;

        while (idx <= 10) {
            System.out.println("안녕하세요! " + idx + "번 고객님!");
            idx++; // == i += 1
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println("안녕하세요! " + i + "번 고객님!");
        }

        int k = 1, sum = 0;
        while (k <= 100) {
            sum += k;
            k++;
        }

        System.out.println("1 ~ 100까지의 누적합계 = " + sum);

        sum = 0;
        for (int i = 1; i < 101; i++) {
            sum += i;
        }
        System.out.println("1 ~ 100까지의 누적합계 = " + sum);

        int num = 97, cnt = 0;
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) cnt++;
        }
        System.out.println("cnt = " + cnt);
    }

    private static boolean isPrime(int n) {
        if (n == 2) return true;
        if (n < 2 || n % 2 == 0) return false;

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }

        return true;
    }
}