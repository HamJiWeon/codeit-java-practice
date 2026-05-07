package oop.constuctor;

public class LearningLog {

    String title;
    int minutes;
    boolean publicLog;

    public LearningLog() {
        System.out.println("기본 생성자 호출");
    }

    public LearningLog(String title, int minutes, boolean publicLog) {
        this.title = title;
        this.minutes = minutes;
        this.publicLog = publicLog;
    }

    public LearningLog(String title, int minutes) {
        this(title, minutes, true);
    }

    public void printSummary() {
        System.out.println(title + " - " + minutes + "분");
    }

    public boolean needsReview() {
        return minutes < 60;
    }
}
