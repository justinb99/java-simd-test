package justinb99.javasimdtest;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class VectorCalculatorTest {

  private VectorCalculator target;

  @Before
  public void before() {
    target = new VectorCalculator();
  }

  @Test
  public void multiply_int() {
    int array1[] = {2, 3, 4, 5};
    int array2[] = {6, 7, 8, 9};
    int result[] = new int[4];
    result = target.multiply(array1, array2, result);
    int expected[] = {12, 21, 32, 45};
    assertArrayEquals(expected, result);
  }

}
