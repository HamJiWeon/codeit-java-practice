package oop.staticfinal;

import static oop.staticfinal.LearningLog.getTotalCreateCount;

public class SprintLogApp {

    public static void main(String[] args) {
        LearningLog javaLog = new LearningLog("Java 시작", 40);
        LearningLog gitLog = new LearningLog("Git 복습", 50, false);
        LearningLog encapsuleLog = new LearningLog("캡슐화 연습", 90);

        LearningLog[] logs = {
                javaLog, gitLog, encapsuleLog
        };

        for (LearningLog log : logs) {
            log.printSummary();
        }

        System.out.println("=========================");

        System.out.println("지금까지 생성된 학습 기록 수: " + getTotalCreateCount());
    }
}
