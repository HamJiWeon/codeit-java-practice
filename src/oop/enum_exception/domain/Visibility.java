package oop.enum_exception.domain;

public enum Visibility {
    PUBLIC("공개", true),
    PRIVATE("비공개", false);

    private final String label;
    private final boolean shareable;

    Visibility(String label, boolean shareable) {
        this.label = label;
        this.shareable = shareable;
    }

    public String getLabel() {
        return label;
    }

    public boolean isShareable() {
        return shareable;
    }
}
