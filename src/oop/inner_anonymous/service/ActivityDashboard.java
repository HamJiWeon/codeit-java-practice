package oop.inner_anonymous.service;

import oop.inner_anonymous.domain.LearningActivity;
import oop.inner_anonymous.printer.ActivityPrinter;

public class ActivityDashboard {

    private final LearningActivity[] activities;

    public ActivityDashboard(LearningActivity[] activities) {
        this.activities = activities;
    }

    public Summary summarize() {

        class Counter {
            private int totalCount;
            private int lectureCount;
            private int practiceCount;
            private int readingCount;

            void add(LearningActivity activity) {
                totalCount++;
                // getCategory()는 LearningActivity의 public API
                switch (activity.getCategory()) {
                    case LECTURE  -> lectureCount++;
                    case PRACTICE -> practiceCount++;
                    case READING  -> readingCount++;
                }
            }

            Summary toSummary() {
                return new Summary(totalCount, lectureCount, practiceCount, readingCount);
            }
        }

        Counter counter = new Counter();
        for (LearningActivity activity : activities) {
            counter.add(activity);
        }
        return counter.toSummary();
    }

//    public record Summary (int totalCount, int lectureCount, int practiceCount, int readingCount) {}

    public static class Summary {
        private final int totalCount;
        private final int lectureCount;
        private final int practiceCount;
        private final int readingCount;

        public Summary(int totalCount, int lectureCount, int practiceCount, int readingCount) {
            this.totalCount = totalCount;
            this.lectureCount = lectureCount;
            this.practiceCount = practiceCount;
            this.readingCount = readingCount;
        }

        public int getTotalCount() {
            return totalCount;
        }

        public int getLectureCount() {
            return lectureCount;
        }

        public int getPracticeCount() {
            return practiceCount;
        }

        public int getReadingCount() {
            return readingCount;
        }
    }
    /**
     * 보고서 출력기:
     * 외부 클래스(ActivityDashboard)가 가지고 있는 activities 배열에 접근해야 하기 때문에
     * static을 붙이지 않은 내부 클래스로 선언.
     */
    public class ReportBuilder {


        private final ActivityPrinter printer;

        public ReportBuilder(ActivityPrinter printer) {
            if (printer == null) {
                throw new IllegalArgumentException("출력 도구는 null일 수 없습니다.");
            }
            this.printer = printer;
        }

        public void print() {
            Summary summary = summarize();  // 외부 클래스의 summarize() 호출
            System.out.println("── 활동 수: 총 " + summary.getTotalCount() + "──"
                    + "개 (강의 " + summary.getLectureCount()
                    + " , 실습 " + summary.getPracticeCount()
                    + " , 독서 " + summary.getReadingCount() + ")");

            for (LearningActivity activity : activities) {  // 외부 클래스의 activities 접근
                printer.print(activity);
            }
        }
    }
}
