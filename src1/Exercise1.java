public class Exercise1 {
  public static void main(String[] ars) {
    int[] array = new int[] { 98, 12, 9, 102, 88 };

    // for (int i = 0; i <= array.length - 1; i++) {
    // System.out.println(array[i]);
    // }

    // for (int value : array) {
    // System.out.println(value);
    // }

    // int i = 0;
    // int result = 0;
    // while (i <= array.length - 1) {
    // result = result + array[i];
    // i++;
    // }

    // System.out.println(result / array.length);

    int[] A = new int[] { 100, 0, 15, 22, 69, 985, 47 };
    for (int i = 0; i <= A.length - 1 - 1; i++) {
      for (int j = A.length - 1; j >= i + 1; j--) {
        if (A[j] < A[j - 1]) {
          int w = A[j];
          A[j] = A[j - 1];
          A[j - 1] = w;
        }
      }
    }
    for (int i = 0; i <= A.length - 1; i++) {
      System.out.println(A[i]);
    }
  }
}
