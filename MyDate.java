import java.util.GregorianCalendar;

public class MyDate {
  private int year;
  private int month;
  private int day;

  public MyDate() {
    setCurrentDate();
    }
  public MyDate(long elapsedTime) {
    setDate(elapsedTime);
    }
  public MyDate(int year, int month, int day) {
    this.year = year;
    this.month = month;
    this.day = day;
    }
  public int getYear() {
    return year;
    }
  public int getMonth() {
    return month;
    }
  public int getDay() {
    return day;
    }
  public void setDate(long elapsedTime) {
    GregorianCalendar calendar = new GregorianCalendar();
    calendar.setTimeInMillis(elapsedTime);
    this.year = calendar.get(GregorianCalendar.YEAR);
    this.month = calendar.get(GregorianCalendar.MONTH);
    this.day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }
  private void setCurrentDate() {
    GregorianCalendar calendar = new GregorianCalendar();
    this.year = calendar.get(GregorianCalendar.YEAR);
    this.month = calendar.get(GregorianCalendar.MONTH);
    this.day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }
}
