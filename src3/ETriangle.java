public class ETriangle {
  int height;
  int bottom;

  public void setHeight(int value) {
    height = value;
  }

  public void setBottom(int value) {
    bottom = value;
  }

  public double getArea() {
    return bottom * height / 2;
  }
}
