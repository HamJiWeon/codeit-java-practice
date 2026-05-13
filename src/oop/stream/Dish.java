package oop.stream;

/**
 * @param name       요리이름
 * @param vegetarian 채식음식 여부
 * @param calories   칼로리
 */
public record Dish(String name, boolean vegetarian, int calories, Type type) {
    public enum Type {
        MEAT("육류"), FISH("어류"), OTHER("기타");

        private final String desc;

        Type(String desc) {
            this.desc = desc;
        }

        public String getDesc() {
            return desc;
        }
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", vegetarian=" + vegetarian +
                ", calories=" + calories +
                ", type=" + type +
                '}';
    }
}
