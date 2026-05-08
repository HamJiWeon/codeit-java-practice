package oop.accessmodifier;

public class LearningLog {

    private String title;
    private int minutes;
    private boolean publicLog;

    public LearningLog() {
        System.out.println("기본 생성자 호출");
    }

    public LearningLog(String title, int minutes, boolean publicLog) {
        this.title = validateTitle(title);
        this.minutes = minutes;
        this.publicLog = publicLog;
    }

    public void extendsStudy(int minutes) {
        if (minutes <= 0) {
            System.out.println("InvalidParameterException: Negative values are not allowed for this operation.");
            return;
        }

        this.minutes += minutes;
    }

    public String getTitle() {
        return title;
    }

    public int getMinutes() {
        return minutes;
    }

    public boolean isPublicLog() {
        return publicLog;
    }

    public LearningLog(String title, int minutes) {
        this(title, minutes, true);
    }

    public void printSummary() {
        String visibility = this.publicLog ? "(공개)" : "(비공개)";
        System.out.println(title + " - " + minutes + "분 " + visibility);
    }

    public boolean needsReview() {
        return minutes < 60;
    }

    public void changeTitle(String newTitle) {
        this.title = validateTitle(newTitle);;
    }

    private String validateTitle(String newTitle) {
        if (newTitle == null || newTitle.isBlank()) {

            return "NullPointerException";
        }

        return newTitle;
    }

    public void openPublic() {
        this.publicLog = true;
    }

    public void closePublic() {
        this.publicLog = false;
    }
}
