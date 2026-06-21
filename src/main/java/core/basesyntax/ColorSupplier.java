package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int index = new Random().nextInt(Ball.Color.values().length);
        Ball.Color color = Ball.Color.values()[index];
        return color.toString();
    }
}
