public class Main1 {
  static int ret;

  // グローバル(大域)変数。同じ名前を部下も宣言しているが別のもの。
  // 同じものは近い方を参照する。
  public static void main(String[] args) {
    int result = fee(12);

    System.out.println(result);
  }
  // 社長はpublicにする
  // 部下は自分の社長からだけ呼ばれる場合はprivateで良い

  private static int fee(int age) {
    int ret;

    if (age <= 3) {
      ret = 100;
    } else if (age <= 9) {
      ret = 300;
    } else {
      ret = 500;
    }

    return ret;
  }
}
