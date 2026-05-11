package oop.enum_exception.domain;

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
        this.id = ++totalCreateCount;
        this.title = normalizeTitle(title);
        this.minutes = minutes;
        this.visibility = visibility;
        this.category = category;
    }

    public void extendStudy(int additionalMinutes) {
        if (additionalMinutes <= 0) {
            System.out.println("잘못된 공부 시간입니다.");
            return;
        }

        this.minutes += additionalMinutes;
    }

    public void changeTitle(String newTitle) {
        this.title = normalizeTitle(newTitle);
    }

    private String normalizeTitle(String newTitle) {
        if (newTitle == null || newTitle.isBlank()) {
            return "제목 없음";
        }

        return newTitle;
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
}