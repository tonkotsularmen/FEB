public class Main0 {
  public static void main(String[] args) {
    String ret = function("abc");
    System.out.println(ret);
    // function("def", 45, 6743);
    // function("Hello World", 525, 54311);
    // function("", 67821, 00);
    // function("12345", 215, 678);
    // function("XYZ", 431, 1);

  }

  public static String function(String str) {
    // System.out.println(str);
    // System.out.println(num1);
    // System.out.println(num2);
    str = "[" + str + "]";
    return str;
  }
}
