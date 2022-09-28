import java.util.*;

public class Betting {
  public static void main(String[] args) {
    double a;
    Scanner sc = new Scanner(System.in);
    a = sc.nextDouble() / 100;

    System.out.println(String.format(Locale.US, "%.10f", 1 + ((1-a) / a)));
    System.out.println(String.format(Locale.US, "%.10f", 1 + (a / (1-a))));
  }
}
