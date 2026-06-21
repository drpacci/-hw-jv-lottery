package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random random = new Random();
    private static final Color[] COLORS = Color.values();

    public String getRandomColor() {
        int randomIndex = random.nextInt(COLORS.length);
        return COLORS[randomIndex].name();
    }
}
