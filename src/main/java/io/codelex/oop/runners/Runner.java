package io.codelex.oop.runners;

public enum Runner {
    BEGINNER(240, 360),
    INTERMEDIATE(210, 240),
    ADVANCED(150, 210);

    private final int minimumTime;//in minutes
    private final int maximumTime;

    Runner(int minimumTime, int maximumTime) {
        this.minimumTime = minimumTime;
        this.maximumTime = maximumTime;
    }

    public int getMinimumTime() {
        return minimumTime;
    }

    public int getMaximumTime() {
        return maximumTime;
    }

    public static Runner getFitnessLevel(double runTimeInMinutes) {
        if (isAdvanced(runTimeInMinutes)) {
            return ADVANCED;
        }
        if (isIntermediate(runTimeInMinutes)) {
            return INTERMEDIATE;
        }
        if (isBeginner(runTimeInMinutes)) {
            return BEGINNER;
        }
        return null;
    }

    private static boolean isAdvanced(double runTimeInMinutes) {
        return runTimeInMinutes <= ADVANCED.getMaximumTime() && runTimeInMinutes >= ADVANCED.getMinimumTime();
    }

    private static boolean isIntermediate(double runTimeInMinutes) {
        return runTimeInMinutes <= INTERMEDIATE.getMaximumTime() && runTimeInMinutes > INTERMEDIATE.getMinimumTime();
    }

    private static boolean isBeginner(double runTimeInMinutes) {
        return runTimeInMinutes < BEGINNER.getMaximumTime() && runTimeInMinutes > BEGINNER.getMinimumTime();
    }

}
