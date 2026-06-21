package core.basesyntax;

public class Ball {
    private final String color;
    private final int number;

    public enum Color {
        RED,
        GREEN,
        BLUE,
        YELLOW,
        BLACK,
        WHITE,
        ORANGE,
        PURPLE,
        PINK,
        BROWN,
        GRAY
    }

    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return this.color + " " + this.number;
    }
}
