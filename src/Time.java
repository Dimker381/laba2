class Time {
    private int secondsFromStartOfDay;
    private static final int SEC_PER_DAY = 24 * 60 * 60;


    public Time(int seconds) {
        if (seconds < 0) seconds = 0;
        this.secondsFromStartOfDay = seconds % SEC_PER_DAY;
    }


    @Override
    public String toString() {
        int s = secondsFromStartOfDay;
        int hours = s / 3600;
        int minutes = (s % 3600) / 60;
        int seconds = s % 60;
        return String.format("%d:%02d:%02d", hours, minutes, seconds);
    }
}
