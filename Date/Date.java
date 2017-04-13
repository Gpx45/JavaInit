public class Date
{
  private int month, day, year;//month = 12, days = 1-31 based, year = any year

  private static final int[] daysPerMonth = // days of each month
  {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

// constructor: call checkMonth to confirm proper value for month;
// call checkDay to confirm proper value for days
  public Date(int theMonth, int theDay, int theYear)
  {
    month = checkMonth(theMonth);
    year = theYear;
    day = checkDay(theDay);

    System.out.printf(
    "Date object constructor for date %s\n", this);
  }// End Date constructor.

  //ultility method to confirm proper month value.
  private int checkMonth(int testMonth)
  {
    if (testMonth > 0 && testMonth <= 12)
    return testMonth;

    else
    throw new IllegalArgumentException(
    "Day out-of-range for the specified month and year");
  }

  private int checkDay(int testDay)
  {
    //check if day in range for month.
    if (testDay > 0 && testDay <= daysPerMonth[month])
    return testDay;

    //check for leap year.
    if (month == 2 && testDay == 29 && (year % 400 == 0 ||
    (year % 4 == 0 && year % 100 != 0)))
    return testDay;
    //otherwise will throw an exception.
    throw new IllegalArgumentException(
    "day out-of-range for the specified month and year.");
  }

  public String toString()
  {
    return String.format("%d/%d/%d", month, day, year);
  }// end of toString.
}// end of class.
