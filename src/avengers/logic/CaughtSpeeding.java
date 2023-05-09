package avengers.logic;

public class CaughtSpeeding {
    public int caughtSpeeding(int speed, boolean isBirthDay) {

        int min = isBirthDay ? 65 : 60;
        int max = isBirthDay ? 85 : 80;

        if (speed >= min && speed <= max) {
            return 1;
        } else if (speed > max) {
            return 2;
        } else {
            return 0;
        }
    }
}
