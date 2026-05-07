import java.util.Scanner;

public class SprintLogApp {

    public static void main(String[] args) {
        String[] titles = {"Java 시작", "Git 복습", "조건문 학습", "반복문 학습"};
        int[] minutes = {40, 30, 75, 120};
        boolean[] publicFlags = {true, false, true, true};

        Scanner sc = new Scanner(System.in);

        while (true) {
            printMenu();

            int menu = sc.nextInt();

            if (menu == 0) {
                System.out.println("종료 되었습니다.");
                break;
            } else {
                if (menu == 1) {
                    printAllLogs(titles, minutes);

                } else if (menu == 2) {
                    printPublicLogs(titles, publicFlags, minutes);

                } else if (menu == 3) {
                    System.out.println("전체 학습 시간: " + getTotal(minutes) + "분");

                } else if (menu == 4) {
                    printReviewsLogs(titles, minutes);

                } else if (menu == 5) {
                    printDivider("긴 학습 기록");

                    for (int i = 0; i < titles.length; i++) {
                        if (minutes[i] >= 100) printLogItem(i, titles, minutes);
                    }
                }
            }
        }
    }

    private static void printReviewsLogs(String[] titles, int[] minutes) {
        printDivider("복습 필요 기록");

        for (int i = 0; i < titles.length; i++) {
            if (minutes[i] < 60) {
                printLogItem(i, titles, minutes);
            }
        }

        double avg = (double) getTotal(minutes) / minutes.length;
        System.out.println("평균 학습 시간: " + avg + "분");
    }

    private static int getTotal(int[] minutes) {
        int total = 0;
        for (int minute : minutes) {
            total += minute;
        }
        return total;
    }

    private static void printPublicLogs(String[] titles, boolean[] publicFlags, int[] minutes) {
        printDivider("공개된 기록");

        for (int i = 0; i < titles.length; i++) {
            if (publicFlags[i]) {
                printLogItem(i, titles, minutes);
            }
        }
    }

    private static void printAllLogs(String[] titles, int[] minutes) {
        printDivider("전체 기록");

        for (int i = 0; i < titles.length; i++) {
            printLogItem(i, titles, minutes);
        }
    }

    private static void printLogItem(int i, String[] titles, int[] minutes) {
        System.out.println((i + 1) + ": " + titles[i] + " - " + minutes[i] + "분");
    }

    public static void printMenu() {
        System.out.println();
        System.out.println("==== SprintLog ====");
        System.out.println("1) 전체 기록 출력");
        System.out.println("2) 공개 기록만 출력");
        System.out.println("3) 전체 학습 시간 출력");
        System.out.println("4) 복습 필요 기록 출력");
        System.out.println("5) 긴 학습 기록 출력");
        System.out.println("0) 종료");
        System.out.print("메뉴를 선택하세요: ");
    }

    public static void printDivider(String title) {
        System.out.println("========== " + title + " ==========");
    }

}
