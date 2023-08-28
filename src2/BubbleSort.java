public class BubbleSort {
  public static void main(String[] args) {
    // 未整列の配列A[i](i=1,2,..., n)をバブルソートで整列する
    int[] A = new int[] { 9, 10, 0, 2, 87, 100 };

    // バブルソートを実施
    sort(A);
    /*
     * 配列の場合は社長は受け取る必要はない。部下で配列を操作する場合、受け取ったそのものを操作するという特徴がある。
     * そのため、戻す必要がない。
     */
    // ソートできたか確認
    confirmation(A);
  }

  public static void sort(int[] A) {
    for (int i = 0; i <= A.length - 2; i++) {

      for (int j = A.length - 1; j >= i + 1; j--) {

        if (A[j] < A[j - 1]) {
          // 入れ替える
          replacement(A, j);
        }
      }
    }
  }

  /*
   * 引数で受け取っら配列Aのj番目とj-1番目の値を入れ替えて戻す
   */
  public static void replacement(int[] A, int j) {
    int w = A[j];
    A[j] = A[j - 1];
    A[j - 1] = w;
  }

  public static void confirmation(int[] A) {
    for (int i = 0; i <= A.length - 1; i++) {
      System.out.println(A[i]);
    }
  }
}
