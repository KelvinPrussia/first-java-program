import java.time.format.DateTimeFormatter;
class Clock {
  public static void main(String[] args) {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
    java.util.Date date = new java.util.Date();
    System.out.printf("The current time is %t", dtf.format(date));
  }
}