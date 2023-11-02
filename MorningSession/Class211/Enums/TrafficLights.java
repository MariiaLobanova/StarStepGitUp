package scr.MorningSession.Class211.Enums;

public enum TrafficLights {
    RED,
    YELLOW,
    GREEN;
    public TrafficLights getNextColor() {
        switch (this) {
            case RED:
                return YELLOW;
            case YELLOW:
                return GREEN;
            case GREEN:
                return RED;
            default:
                return this;
        }
    }

    public static void main(String[] args) {
        TrafficLights currentColor = TrafficLights.RED;
        int numIterations = 5;

        for (int i = 0; i < numIterations; i++) {
            System.out.println("Current color: " + currentColor);

            currentColor = currentColor.getNextColor();
        }
    }
}

