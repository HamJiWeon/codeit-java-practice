package oop.enum_exception.domain;

import oop.enum_exception.exception.InvalidActivityException;

import static oop.enum_exception.domain.Visibility.*;
import static oop.enum_exception.domain.Visibility.PRIVATE;

public abstract class LearningActivity {

    private static int totalCreateCount = 0;

    private final long id;
    private String title;
    private int minutes;
    private Visibility visibility;
    private final ActivityCategory category;

//    public LearningActivity(String title, int minutes) {
//        this(title, minutes, PUBLIC);
//    }

    public LearningActivity(String title, int minutes, Visibility visibility, ActivityCategory category) {
        validateTitle(title);
        validateMinutes(minutes);
        this.id = ++totalCreateCount;
        this.title = title.trim();
        this.minutes = minutes;
        this.visibility = visibility;
        this.category = category;
    }

    public void extendStudy(int additionalMinutes) {
        if (additionalMinutes <= 0) {
            throw new InvalidActivityException("추가 학습 시간은 1분 이상이여야 합니다. 입력 값:" + additionalMinutes);
        }

        this.minutes += additionalMinutes;
    }

    public void changeTitle(String newTitle) {
        validateTitle(newTitle);
        this.title = newTitle;
    }

    private void validateTitle(String newTitle) {
        if (newTitle == null || newTitle.isBlank()) {
            throw new InvalidActivityException("학습 제목은 비워둘 수 없습니다.");
        }
    }

    private void validateMinutes(int newMinutes) {
        if (newMinutes <= 0) {
            throw new InvalidActivityException("학습 시간은 1분 이상이여야 합니다. 입력값: " + newMinutes);
        }
    }

    public void openToPublic() {
        this.visibility = PUBLIC;
    }

    public void hideFromPublic() {
        this.visibility = PRIVATE;
    }


    public abstract String getActivityType();
    public abstract String getDetailText();

    public static int getTotalCreateCount() {
        return totalCreateCount;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getMinutes() {
        return minutes;
    }

    public Visibility getVisibility() {
        return visibility;
    }

    public String getVisibilityText() {
        return visibility.getLabel();
    }

    public boolean isPublicActivity() {
        return visibility == PUBLIC;
    }

    public ActivityCategory getCategory() {
        return category;
    }

    public static int getTotalCreatedCount() {
        return totalCreateCount;
    }
}