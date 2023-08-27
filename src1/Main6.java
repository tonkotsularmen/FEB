import java.util.Calendar;

public class Main6 {
  public static void main(String[] args) {
    Calendar calendar = Calendar.getInstance();
    int month = calendar.get(Calendar.MONTH) + 1;

    String monthName = "";

    if (month == 1) {
      monthName = "1月";
    }

    if (month == 2) {
      monthName = "2月";
    }

    if (month == 3) {
      monthName = "3月";
    }

    if (month == 4) {
      monthName = "4月";
    }

    if (month == 5) {
      monthName = "5月";
    }

    if (month == 5) {
      monthName = "5月";
    }

    if (month == 6) {
      monthName = "6月";
    }

    if (month == 7) {
      monthName = "7月";
    }

    if (month == 8) {
      monthName = "8月";
    }

    if (month == 9) {
      monthName = "9月";
    }

    if (month == 10) {
      monthName = "10月";
    }

    if (month == 11) {
      monthName = "11月";
    }

    if (month == 12) {
      monthName = "12月";
    }

    System.out.println(monthName);
  }
}
