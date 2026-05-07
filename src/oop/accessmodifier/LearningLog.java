package oop.accessmodifier;

public class LearningLog {

    private String title;
    private int minutes;
    private boolean publicLog;

    public LearningLog() {
        System.out.println("기본 생성자 호출");
    }

    public LearningLog(String title, int minutes, boolean publicLog) {
        this.title = title;
        this.minutes = minutes;
        this.publicLog = publicLog;
    }

    public void setMinutes(int minutes) {
        if (minutes <= 0) {
            System.out.println("InvalidParameterException: Negative values are not allowed for this operation.");
            return;
        }

        this.minutes += minutes;
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
