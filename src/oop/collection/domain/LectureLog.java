package oop.collection.domain;

import oop.collection.policy.Reviewable;
import oop.collection.policy.Shareable;

import static oop.collection.domain.ActivityCategory.LECTURE;

public class LectureLog extends LearningActivity implements Reviewable, Shareable {

    public String instructorName;

    public LectureLog(String title, int minutes, Visibility visibility, String instructorName) {
        super(title, minutes, visibility, LECTURE);
        this.instructorName = normalizeInstructorName(instructorName);
    }

    @Override
    public boolean needsReview() {
        return getCategory().isShortStudy(getMinutes());
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
        return isPublicActivity();
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
