package oop.inheritance.domain;

public class LectureLog extends LearningActivity {

    private String instructorName;

    public LectureLog(String title, int minutes, boolean publicActivity, String instructorName) {
        super(title, minutes, publicActivity);
        this.instructorName = validateInstructorName(instructorName);
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    @Override
    public void printSummary() {
        System.out.println("[강의] #" + getId() + ". " + getTitle() + " - " + getMinutes()
                + "분 강사: " + instructorName);
    }

    @Override
    public boolean needsReview() {
        return getMinutes() < 60;
    }

    private String validateInstructorName(String instructorName) {
        if (instructorName == null || instructorName.isBlank()) {
            return "NullPointerException";
        }

        return instructorName;
    }
}
