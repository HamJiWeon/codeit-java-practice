package oop.intro;

public class LearningLog {

    String title;
    int minutes;
    boolean publicLog;

    public void printSummary() {
        System.out.println(title + " - " + minutes + "분");
    }

    public boolean needsReview() {
        return minutes < 60;
    }
}
