package justinb99.javasimdtest;

import java.text.MessageFormat;

public class Main {

  private static final int SIZE = 100000000;
  public static VectorCalculator vectorCalculator = new VectorCalculator();

  public static void main(String[] args) {
    long total = 0;
    for(int i = 0; i < 10; i++) {
      long elapsed = iteration(i);
      if (i > 0)
        total += elapsed;
    }

    long average = total / 9;
    System.out.println(MessageFormat.format("Avg time {0}ns for {1} ints.", average, SIZE));
  }

//  public static long iteration(int iter) {
//    var array1 = new int[SIZE];
//    var array2 = new int[SIZE];
//    var result = new int[SIZE];
//
//    for (int i = 0; i < SIZE; i++) {
//      array1[i] = i * iter;
//      array2[i] = i * iter * 2;
//    }
//
//    var start = System.nanoTime();
//    result = vectorCalculator.multiply(array1, array2, result);
//    var end = System.nanoTime();
//
//    System.out.println(MessageFormat.format("Multiplication took {0}ns for {1} ints.", (end - start), SIZE));
//
//    return (end - start);
//  }

  public static long iteration(int iter) {
    var array1 = new float[SIZE];
    var array2 = new float[SIZE];
    var result = new float[SIZE];

    for (int i = 0; i < SIZE; i++) {
      array1[i] = i * iter;
      array2[i] = i * iter / 3.0f;
    }

    var start = System.nanoTime();
    result = vectorCalculator.multiply(array1, array2, result);
    var end = System.nanoTime();

    System.out.println(MessageFormat.format("Multiplication took {0}ns for {1} floats.", (end - start), SIZE));

    return (end - start);
  }

}
