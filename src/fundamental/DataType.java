package fundamental;
import java.util.Date;

public class DataType {
  public static void main(String[] args) {
// Primitive Types -> integer (long, short, byte, int), float, boolean, char
// Non-Primitive Types(Reference) -> String, Array, Date

      int a = 10;
      short b = 50;
      long age = 4000000;
      byte d = 5;
      float weight = 1.45678f;
      double height = 20.990005d;

      char x = 'J';
      boolean y = true;

      Date now = new Date();
      long time = now.getTime();
      System.out.println(now);
      System.out.println(time);
  }
}


