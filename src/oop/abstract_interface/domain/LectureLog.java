package oop.abstract_interface.domain;

import oop.abstract_interface.policy.Reviewable;
import oop.abstract_interface.policy.Shareable;

public class LectureLog extends LearningActivity implements Reviewable, Shareable {

    public String instructorName;

    public LectureLog(String title, int minutes, boolean publicActivity, String instructorName) {
        super(title, minutes, publicActivity);
        this.instructorName = normalizeInstructorName(instructorName);
    }

    @Override
    public boolean needsReview() {
        return getMinutes() < 60;
    }

    @Override
    public void printReviewTarget() {
        System.out.println("[복습 권장] " + getTitle() + " (" + getMinutes() + "분)");
    }

    private String normalizeInstructorName(String instructorName) {
        if (instructorName == null || instructorName.isBlank()) {
            return "강사 미정";
        }

        return instructorName;
    }

    @Override
    public boolean canShare() {
        return ispublicActivity();
    }

    @Override
    public String getShareTitle() {
        return getTitle();
    }

    @Override
    public String getActivityType() {
        return "강의";
    }

    @Override
    public String getDetailText() {
        return "강사: " + instructorName;
    }
}
