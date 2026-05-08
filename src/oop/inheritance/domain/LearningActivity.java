package oop.inheritance.domain;

public class LearningActivity {

    private static final int REVIEW_THRESHOLD_MINUTES = 60;

    private static int totalCreateCount = 0;

    private final long id;
    private String title;
    private int minutes;
    private boolean publicActivity;

    public LearningActivity(String title, int minutes) {
        this(title, minutes, true);
    }

    public LearningActivity(String title, int minutes, boolean publicActivity) {
        this.id = ++totalCreateCount;
        this.title = validateTitle(title);
        this.minutes = minutes;
        this.publicActivity = publicActivity;
    }

    public void extendsStudy(int minutes) {
        if (minutes <= 0) {
            System.out.println("InvalidParameterException: Negative values are not allowed for this operation.");
            return;
        }

        this.minutes += minutes;
    }

    public long getId() {
        return id;
    }

    public static int getTotalCreateCount() {
        return totalCreateCount;
    }

    public String getTitle() {
        return title;
    }

    public int getMinutes() {
        return minutes;
    }

    public boolean isPublicActivity() {
        return publicActivity;
    }

    public void printSummary() {
        String visibility = this.publicActivity ? "(공개)" : "(비공개)";
        System.out.println("#" + id + ". " + title + " - " + minutes + "분 " + visibility);
    }

    public boolean needsReview() {
        return minutes < REVIEW_THRESHOLD_MINUTES;
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
        this.publicActivity = true;
    }

    public void closePublic() {
        this.publicActivity = false;
    }
}
