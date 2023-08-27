public class Loop3 {
  public static void main(String[] args) {
    int n = 11;

    // while (n <= 10) {
    // System.out.println(n);

    // n = n + 1;
    // }

    // do {
    // System.out.println(n);
    // n = n + 1;
    // } while (n <= 10);

    int array[] = new int[] { 1, 2, 3, 4, 5 };

    // for (int i = 0; i <= array.length - 1; i = i + 1) {
    // System.out.println(array[i]);
    // }

    for (int value : array) {
      System.out.println(value);
    }
  }
}
