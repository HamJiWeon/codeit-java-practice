package oop.inheritance.app;

import oop.inheritance.domain.LearningActivity;
import oop.inheritance.domain.LectureLog;
import oop.inheritance.domain.PracticeLog;

import static oop.inheritance.domain.LearningActivity.getTotalCreateCount;

public class SprintLogApp {

    public static void main(String[] args) {
        LearningActivity javaLecture = new LectureLog("Java 객체지향", 50, true, "박코치");
        LearningActivity gitPractice = new PracticeLog("Git 브랜치 실습", 70, true, 80);
        LearningActivity oopPractice = new PracticeLog("캡슐화 리팩토링", 40, false, 45);

        LearningActivity[] logs = {
                javaLecture, gitPractice, oopPractice
        };

        System.out.println("지금까지 생성된 학습 기록 수: " + getTotalCreateCount());

        for (LearningActivity log : logs) {
            log.printSummary();
        }

        System.out.println();
        System.out.println("==================================================");

        System.out.println("=== 복습이 필요한 상황 ===");

        for (LearningActivity log : logs) {
            if (log.needsReview()) log.printSummary();
        }

        System.out.println();
        System.out.println("==================================================");

        System.out.println("=== 실습 활동만 보기 ===");
        for (LearningActivity log : logs) {
            if (log instanceof PracticeLog) {
                System.out.println(log.getTitle() + " 완료율: " + ((PracticeLog) log).getCompletionRate() + "%");
            }
        }

        System.out.println();
        System.out.println("==================================================");

    }
}
