package random;

import java.util.Random;

public class Dice {

    private final Random random = new Random();

    public Numbers roll() {

        return new Numbers(random.nextInt(1, 7), random.nextInt(1, 7));

    }
}
