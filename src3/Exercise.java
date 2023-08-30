public class Exercise {
  public void run() {
    ECircle circle = new ECircle();
    ESquare square = new ESquare();
    ETriangle triangle = new ETriangle();

    circle.setRadius(10);

    square.setHeight(32);
    square.setWidth(12);

    triangle.setBottom(20);
    triangle.setHeight(8);

    double[] area = new double[] {
        circle.getArea(),
        square.getArea(),
        triangle.getArea()
    };

    double result = 0;

    for (int i = 0; i <= area.length - 1; i++) {
      result = result + area[i];
    }

    System.out.print("面積は" + result + "です。");
  }
}
