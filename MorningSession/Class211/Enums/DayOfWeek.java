package scr.MorningSession.Class211.Enums;

//1.Days of the Week:
//Create an enum named DayOfWeek to represent the days of the week.
//Define constants for each day (e.g., SUNDAY, MONDAY, TUESDAY, etc.) within the enum.
//Implement a method called getNextDay in the enum that calculates and returns the next
// day of the week for a given day.
//Demonstrate the usage of the DayOfWeek enum by using it to find the next day for a
// specific day (e.g., next day after "TUESDAY").
public enum DayOfWeek {
     MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public DayOfWeek getNextDay() {
        switch (this) {
            case MONDAY:
                return TUESDAY;
            case TUESDAY:
                return WEDNESDAY;
            case WEDNESDAY:
                return THURSDAY;
            case THURSDAY:
                return FRIDAY;
            case FRIDAY:
                return SATURDAY;
            case SATURDAY:
                return SUNDAY;
            case SUNDAY:
                return MONDAY;
            default:
                return this;
        }
    }

    public static void main(String[] args) {
        DayOfWeek currentDay = DayOfWeek.TUESDAY;
        DayOfWeek nextDay = currentDay.getNextDay();

        System.out.println("Current day: " + currentDay);
        System.out.println("Next day: " + nextDay);
    }
}











