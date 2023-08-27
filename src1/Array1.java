public class Array1 {
  public static void main(String[] args) {
    // int value = 1; // 一戸建て
    // // int[] result = new int[3]; // 3部屋のマンション

    // int[] result = new int[] { 11, 32, 99 };
    // // result[0] = 123;
    // // result[1] = 200;
    // // result[2] = 880;

    // System.out.println(value);

    // System.out.println(result[0]);
    // // System.out.println(result[100 % 3 + 1]);
    // System.out.println(result[value]);

    int[] array = new int[] { 1, 2, 3, 4, 5 };
    // String[] array = new String[] { "1", "2", "3", "4", "5" };
    // int right, left;
    // int tmp;

    array[2] = array[3];
    array[3] = array[4];

    System.out.println(array[0]);
    System.out.println(array[1]);
    System.out.println(array[2]);
    System.out.println(array[3]);
    System.out.println(array[4]);
  }
}
