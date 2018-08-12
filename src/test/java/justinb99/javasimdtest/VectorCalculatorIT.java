package justinb99.javasimdtest;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class VectorCalculatorIT {

  private static final int SIZE = 10000000;

  private VectorCalculator target;

  @Before
  public void before() {
    target = new VectorCalculator();
  }

  @Test
  public void multiply_int() {
    var array1 = new int[SIZE];
    var array2 = new int[SIZE];
    var result = new int[SIZE];

    for (int i = 0; i < SIZE; i++) {
      array1[i] = i;
      array2[i] = i * 2;
    }

    var start = System.nanoTime();
    result = target.multiply(array1, array2, result);
    var end = System.nanoTime();

    System.out.println("Multiplication took " + (end - start) + "ns.");
  }
}
