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
        if (runTimeInMinutes <= ADVANCED.getMaximumTime() && runTimeInMinutes >= ADVANCED.getMinimumTime())
            return ADVANCED;
        if (runTimeInMinutes <= INTERMEDIATE.getMaximumTime() && runTimeInMinutes > INTERMEDIATE.getMinimumTime())
            return INTERMEDIATE;
        if (runTimeInMinutes < BEGINNER.getMaximumTime() && runTimeInMinutes > BEGINNER.getMinimumTime())
            return BEGINNER;
        return null;
    }
}
