public class Main3 {
  public static void main(String[] args) {
    int num1 = 123;
    int num2 = 900;
    int result1 = num1 / num2;
    double result2 = num1 / num2;
    double result3 = (double) num1 / num2;
    int result4 = num1 % num2;
    System.out.println("計算結果は" + result1);
    System.out.println("計算結果は" + result2);
    System.out.println("計算結果は" + result3);
    System.out.println("計算結果は" + result4);

    int x;
    int y;

    x = 50;
    y = x % 23;
    System.out.println(y);
  }
}
