public class TestMyDate {
  public static void main(String[] args) {
    MyDate currentDate = new MyDate();
    MyDate customDate = new MyDate(34355555133101L);
    System.out.println("Current Date:");
      displayDateInfo(currentDate);
    System.out.println("\nCustom Date:");
      displayDateInfo(customDate);
  }
  private static void displayDateInfo(MyDate date) {
    System.out.println("Year: " + date.getYear());
    System.out.println("Month: " + date.getMonth());
    System.out.println("Day: " + date.getDay());
  }
}
