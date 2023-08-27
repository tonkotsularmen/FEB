public class Main4 {
  public static void main(String[] args) {
    int ret;
    int age = 9;

    if (age <= 3) {
      // 条件を満たす際に実行する命令
      ret = 100;
    } else if (age >= 4 && age <= 9) { // age <= 9 だけでいい
      ret = 300;
    } else {
      ret = 500;
    }

    System.out.println(ret);

    int value;
    value = 0;

    if (value != 0 || value == 100) {
      System.out.println("valueの値は0または100");
    } else {
      System.out.println("valueの値は0であり100ではない");
    }
  }
}
