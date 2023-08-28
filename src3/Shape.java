import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Shape {
  int top; // メンバー変数
  int left;
  int height;
  int width;
  String color;

  protected void execute(String htmlBody) {
    try {
      File file = new File("shape.html");
      FileWriter filewriter = new FileWriter(file, true);
      filewriter.write(htmlBody);
      filewriter.close();
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}
