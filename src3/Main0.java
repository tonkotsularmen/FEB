public class Main0 {
  public static void main(String[] args) {
    // クラス(設計図)からインスタンスを生成する
    Log log1 = new Log();
    Log log2 = new Log();

    log1.run();
    int result1 = log1.calc(64);
    System.out.println(result1);

    int result2 = log2.calc(90);
    System.out.println(result2);
  }
}
