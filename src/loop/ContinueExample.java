package loop;

public class ContinueExample {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            if (i == 3) continue;

            System.out.print(i + " ");
        }

        System.out.println("\n====================================");

        int n = 1;
        while (n <= 10) {
            if (n == 3) continue;
            System.out.print(n + " ");
            n++;
        }
    }
}
