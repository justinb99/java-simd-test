package justinb99.javasimdtest;

public class VectorCalculator {

  public int[] multiply(int[] array1, int[] array2, int result[]) {
    for(int i = 0; i < array1.length; i++) {
      result[i] = array1[i] * array2[i];
    }
    return result;
  }

  public float[] multiply(float[] array1, float[] array2, float[] result) {
    for(int i = 0; i < array1.length; i++) {
      result[i] = array1[i] * array2[i];
    }
    return result;
  }

}
