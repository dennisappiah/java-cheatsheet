package foundation;

import java.util.Scanner;

public class DataType {
  public static void main(String[] args) {
// Primitive Types -> integer (long, short, byte, int), float, boolean, char
// Non-Primitive -> String, Array

      int a = 10;
      int h = 20;
      short b = 50;
      long age = 4000000;
      byte d = 5;

      float weight = 1.45678f;
      double height = 20.990005d;

      char x = 'J';
      boolean y = true;

      float z = (float) a / h;


      Scanner scanner = new Scanner(System.in);

      System.out.println("Please enter your weight");

      float w = scanner.nextFloat();

      System.out.println("Please enter your height");

      float hh = scanner.nextFloat();

      float bmi = w / (hh * hh);

      System.out.println("bmi= " + bmi);

  }
}


