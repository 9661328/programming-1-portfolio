import java.util.Date;
import java.text.*;

class DateClass {
  public static void main(String[] args) {
    Date date = new Date();

    SimpleDateFormat time = new SimpleDateFormat("HH.mm.ss z");
    SimpleDateFormat DMY = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat YMD = new SimpleDateFormat("yyyy/MM/dd");

    System.out.println(date);
    System.out.println(date.getTime());
    System.out.println("Current time: " + time.format(date));
    System.out.println("Current date (DD/MM/YYYY): " + DMY.format(date));
    System.out.println("Current date (YYYY/MM/DD): " + YMD.format(date));
  }
}