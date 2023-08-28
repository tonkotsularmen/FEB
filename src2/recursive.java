public class recursive {
  public static void main(String[] args) {
    // 階乗 => 3 * 2 * 1 をする時にとても便利なのが再帰
    int result = factorial(3);
    System.out.println(result);
  }

  private static int factorial(int num) {

    // int result = num;
    // for (int i = num; i > 1; i--) {
    // result = result * (i - 1);
    // }

    if (num > 0) {
      return num * factorial(num - 1);
    }
    if (num == 0) {
      return 1;
    }

    return 0;
  }
}
