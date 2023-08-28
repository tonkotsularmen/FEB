import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Square extends Shape {

  public void draw() {
    String htmlBody = "<rect x=" + left + "y=" + top + "width=" + width + "height=" + height + "fill=" + color + "/>";
    execute(htmlBody);
  }

}
