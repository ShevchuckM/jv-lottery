package core.basesyntax;

import java.util.Random;

public class Lottery {
    public int getRandomBall() {
        Random randomBall = new Random();
        int value = randomBall.nextInt(100);
        return value;
    }
}
