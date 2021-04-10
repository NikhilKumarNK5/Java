import java.util.*;
public class DateUtil {
    private final int MIN_YEAR = 1;
    private final int MAX_YEAR = 9999;
    private final String[] strMonths = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov",
            "Dec" };
    private final String[] strDays = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
    private final int[] daysInMonths = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    private final int[] nonLeapYearMonthNumbers = { 0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5 };
    private final int[] leapYearMonthNumbers = { 6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5 };
    public static void main(String[] args) {
        DateUtil aDateUtil = new DateUtil();
		System.out.println("  Leap year or not (True / false)");
		System.out.println(" Checking whether 1990 is a leap year or not");
        System.out.println(aDateUtil.isLeapYear(1900));
		System.out.println(" Checking whether 2000 is a leap year or not");
        System.out.println(aDateUtil.isLeapYear(2000));
		System.out.println(" Checking whether 2010 is a leap year or not");
        System.out.println(aDateUtil.isLeapYear(2010));
		System.out.println(" Checking whether 2012 is a leap year or not");
        System.out.println(aDateUtil.isLeapYear(2012));
		
		System.out.println("  Valid Date or not (True / false)");
		System.out.println(" Checking whether (2012,2,29) is a valid date or not");
        System.out.println(aDateUtil.isValidDate(2012, 2, 29));
		System.out.println(" Checking whether (2010,2,29) is a valid date or not");
        System.out.println(aDateUtil.isValidDate(2010, 2, 29));
		System.out.println(" Checking whether (2099,12,29) is a valid date or not");
        System.out.println(aDateUtil.isValidDate(2099, 12, 31));
		System.out.println(" Checking whether (2032,8,32) is a valid date or not");
        System.out.println(aDateUtil.isValidDate(2099, 12, 32));
		
		System.out.println("  Getting the day of the week on a particular date");
		System.out.println(" Day on (1992,4,24)");
        System.out.println(aDateUtil.getDayOfWeek(1992, 4, 24));
		System.out.println(" Day on (2000,12,17)");
        System.out.println(aDateUtil.getDayOfWeek(2000, 12, 17));
		System.out.println(" Day on (2052,6,19)");
        System.out.println(aDateUtil.getDayOfWeek(2052, 6, 19));
		System.out.println(" Day on (2012,2,29)");
        System.out.println(aDateUtil.getDayOfWeek(2012, 2, 29));
		
		System.out.println("  Getting the Day Name(Sunday , Monday ,etc)");
		System.out.println(" Day on (1992,4,24)");
        aDateUtil.getDayOfWeekTest(1992, 4, 24);
		System.out.println(" Day on (2000,12,17)");
        aDateUtil.getDayOfWeekTest(2000, 12, 17);
		System.out.println(" Day on (2052,6,19)");
        aDateUtil.getDayOfWeekTest(2052, 6, 19);
		System.out.println(" Day on (2012,6,29)");
        aDateUtil.getDayOfWeekTest(2012, 2, 29);
		
		System.out.println("  Formatting the give date");
		System.out.println(" (1992,4,24)");
        System.out.println(aDateUtil.toString(1992, 4, 24));
		System.out.println(" (2020,2,29)");
        System.out.println(aDateUtil.toString(2020, 2, 29));
    }
    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    private boolean isValidDate(int year, int month, int day) {
        if (year < MIN_YEAR || year > MAX_YEAR) {
            return false;
        }
        if (month < 1 || month > 12) {
            return false;
        }
        int monthDays = daysInMonths[month - 1] + (month == 2 && isLeapYear(year) ? 1 : 0);
        return 1 <= day && day <= monthDays;
    }
    private int getDayOfWeek(int year, int month, int day) {
        int magicCenturyNumber = 6 - 2 * ((year / 100) % 4);
        int lastTwoDigitsOfYear = year % 100;
        int magicYearNumber = lastTwoDigitsOfYear / 4;
        int magicMonthNumber = isLeapYear(year) ? leapYearMonthNumbers[month - 1] : nonLeapYearMonthNumbers[month - 1];
        int magicDayNumber = day;
        return (magicCenturyNumber + lastTwoDigitsOfYear + magicYearNumber + magicMonthNumber + magicDayNumber) % 7;
    }
    private void getDayOfWeekTest(int year, int month, int day) {
        Calendar cal = new GregorianCalendar(year, month - 1, day);
        int dayNumber = cal.get(Calendar.DAY_OF_WEEK);
        String[] calendarDays = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        System.out.println("It is " + calendarDays[dayNumber - 1]);
    }
    private String toString(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            return "Not a valid date!";
        }
        int d = getDayOfWeek(year, month, day);
        return strDays[d] + " " + day + " " + strMonths[month - 1] + " " + year;
    }
}
