public class Rectangle {
  private double base;
  private double height;

  public Rectangle(double base, double height) {
    //this.base & this.height are very important DO NOT DELETE AGAIN FUTURE MADELEINE
 this.base = base;
  this.height = height;

  }

  public double getBase() {
    return base;
  }

  public double getHeight() {
    return height;
  }

  public double getArea() {
    return base * height;
  }

  public double getPerimeter() {
    return 2 * (base + height);
  }

  public double getDiagonalLength() {
    return Math.sqrt(base * base + height * height);
  }
}
