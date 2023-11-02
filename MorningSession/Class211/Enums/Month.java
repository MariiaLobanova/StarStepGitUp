package scr.MorningSession.Class211.Enums;
// 3.Months of the Year:
//Create an enum named Month to represent the months of the year.
//Define constants for each month (e.g., JANUARY, FEBRUARY, etc.) within the enum.
//Implement a constructor in the enum that takes an integer representing the number of days in the month and stores it as an instance variable.
//Implement a method called getDays that returns the number of days in a specific month.
//Demonstrate the usage of the Month enum by finding and printing the number of days in a particular month (e.g., "FEBRUARY").
public enum Month {
    JANUARY(31),
    FEBRUARY(28),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(31),
    SEPTEMBER(30),
    OCTOBER(31),
    NOVEMBER(30),
    DECEMBER(31);

    private final int days;

    Month(int days) {
        this.days = days;
    }

    public int getDays() {
        return days;
    }

    public static void main(String[] args) {
        Month month1 = Month.FEBRUARY;
        System.out.println("Amount of days in "+ month1+" : " + month1.getDays() + "days");
     }
}
