package oop.stream;

import oop.stream.Dish.Type;

public class DishDetail {
    private final String name;
    private final Type type;

    public DishDetail(Dish dish) {
        this.name = dish.name();
        this.type = dish.type();
    }

    public DishDetail(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "SimpleDish{" +
                "name = " + name +
                ", type = " + type.getDesc() +
                '}';
    }
}
