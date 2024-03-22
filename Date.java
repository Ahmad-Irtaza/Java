public class Date {
    private int day;
    private int month;
    private int year;

    // Constructor with three integer values (MM/DD/YYYY format)
    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // Constructor with a String and two integer values (June 14, 1992 format)
    public Date(String monthName, int day, int year) {
        this.month = convertMonth(monthName);
        this.day = day;
        this.year = year;
    }

    // Constructor with two integer values (DDD YYYY format)
    public Date(int dayOfYear, int year) {
        this.year = year;
        int[] daysInMonth = {31, isLeapYear(year) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDays = 0;
        for (int i = 0; i < daysInMonth.length; i++) {
            totalDays += daysInMonth[i];
            if (totalDays >= dayOfYear) {
                this.month = i + 1;
                this.day = daysInMonth[i] - (totalDays - dayOfYear);
                break;
            }
        }
    }

    // Method to convert month name to numeric value
    private int convertMonth(String monthName) {
        switch (monthName.toLowerCase()) {
            case "january": return 1;
            case "february": return 2;
            case "march": return 3;
            case "april": return 4;
            case "may": return 5;
            case "june": return 6;
            case "july": return 7;
            case "august": return 8;
            case "september": return 9;
            case "october": return 10;
            case "november": return 11;
            case "december": return 12;
            default: return -1; // Invalid month name
        }
    }

    // Method to check if a year is a leap year
    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to output the date in MM/DD/YYYY format
    public String formatDate1() {
        return String.format("%02d/%02d/%04d", month, day, year);
    }

    // Method to output the date in June 14, 1992 format
    public String formatDate2() {
        return String.format("%s %d, %04d", getMonthName(), day, year);
    }

    // Method to output the date in DDD YYYY format
    public String formatDate3() {
        return String.format("%d %04d", getDayOfYear(), year);
    }

    // Method to get the month name based on the numeric month value
    private String getMonthName() {
        String[] monthNames = {"January", "February", "March", "April", "May", "June",
                               "July", "August", "September", "October", "November", "December"};
        return monthNames[month - 1];
    }

    // Method to calculate the day of year
    private int getDayOfYear() {
        int[] daysInMonth = {31, isLeapYear(year) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDays = day;
        for (int i = 0; i < month - 1; i++) {
            totalDays += daysInMonth[i];
        }
        return totalDays;
    }

    public static void main(String[] args) {
        // Test the Date class
        Date date1 = new Date(6, 14, 1992);
        Date date2 = new Date("June", 14, 1992);
        Date date3 = new Date(166, 1992);

        // Output the dates in multiple formats
        System.out.println("Date 1: " + date1.formatDate1());
        System.out.println("Date 2: " + date2.formatDate2());
        System.out.println("Date 3: " + date3.formatDate3());
    }
}
