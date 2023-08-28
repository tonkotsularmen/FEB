public class recursive2 {
  public static void main(String[] args) {
    // 階乗 => 3 * 2 * 1 をする時にとても便利なのが再帰
    int result = 長男(3);
    System.out.println(result);
  }

  private static int 長男(int num) {

    if (num > 0) {
      return num * 次男(num - 1);
    }
    if (num == 0) {
      return 1;
    }

    return 0;
  }

  private static int 次男(int num) {

    if (num > 0) {
      return num * 三男(num - 1);
    }
    if (num == 0) {
      return 1;
    }

    return 0;
  }

  private static int 三男(int num) {

    if (num > 0) {
      return num * 四男(num - 1);
    }
    if (num == 0) {
      return 1;
    }

    return 0;
  }

  private static int 四男(int num) {

    if (num > 0) {
      return num * 四男(num - 1);
    }
    if (num == 0) {
      return 1;
    }

    return 0;
  }
}
