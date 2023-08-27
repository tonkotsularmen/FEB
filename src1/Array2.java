public class Array2 {
  public static void main(String[] args) {
    // 多次元配列はマンションの１階、２階という話
    int[][] array = new int[][] {
        { 913, 452, 65217, 6, 6542 }, // 0階
        { 301, 9765, 3, 43, 54536 }, // 1階
        { 6576, 547, 542, 6543, 5632 }, // 2階
        { 8765, 812, 3677, 6526, 2567 }, // 3階
        { 764, 5743, 3556, 467, 62 } // 4階
    };

    array[2] = array[3];
    array[3] = array[4];

    System.out.println(array[4][0]);
    System.out.println(array[3][1]);
    System.out.println(array[2][2]);
    System.out.println(array[1][3]);
    System.out.println(array[0][4]);

    int result = array[3][2] + array[1][4];

    System.out.println(result);
  }
}
