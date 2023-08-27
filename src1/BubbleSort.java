public class BubbleSort {
  public static void main(String[] args) {
    // 未整列の配列A[i](i=1,2,..., n)をバブルソートで整列する
    int[] A = new int[] { 9, 10, 0, 2, 87, 100 };

    for (int i = 0; i <= A.length - 2; i++) {
      for (int j = A.length - 1; j >= i + 1; j--) {
        // System.out.println("i=" + i + "/j=" + j);
        if (A[j] < A[j - 1]) {
          int w = A[j];
          A[j] = A[j - 1];
          A[j - 1] = w;
        }
      }
    }
    // ソートできたか確認
    for (int i = 0; i <= A.length - 1; i++) {
      System.out.println(A[i]);
    }
  }
}
