import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Circle extends Shape {
  public Circle(String str) {

  }

  public void draw() {
    String htmlBody = "<ellipse cx=" + left + "cy=" + top + "rx=" + width + "ry=" + height + "fill=" + color + "/>";
    execute(htmlBody);
  }

}
