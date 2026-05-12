package oop.lambda;

public class Apple {
    private int weight;
    private Color color;

    public Apple() {
    }

    public Apple(int weight, Color color) {
        this.weight = weight;
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "이 사과의 무게는 " + weight + "g 이고 색깔은 " + color + "색이야";
    }
}
