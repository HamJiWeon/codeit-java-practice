package oop.abstract_interface.domain;

import oop.abstract_interface.policy.Reviewable;
import oop.abstract_interface.policy.Shareable;

public class LectureLog extends LearningActivity implements Reviewable, Shareable {

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

    @Override
    public void printReviewTarget() {
        printSummary();
    }

    private String validateInstructorName(String instructorName) {
        if (instructorName == null || instructorName.isBlank()) {
            return "NullPointerException";
        }

        return instructorName;
    }

    @Override
    public boolean canShare() {
        return isPublicActivity();
    }

    @Override
    public String getShareTitle() {
        return getTitle();
    }
}
