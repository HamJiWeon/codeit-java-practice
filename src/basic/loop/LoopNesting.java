package basic.loop;

public class LoopNesting {

    public static void main(String[] args) {

        int total = 0;

        for (int i = 30; i <= 100; i++) {
            int cnt = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cnt++;
                }
            }

            if (cnt == 2) total++;
        }

        System.out.println("소수의 개수: " + total + "개");
    }
}
