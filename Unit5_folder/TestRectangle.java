public class TestRectangle {
  public static void main(String[] args) {
    Rectangle rect = new Rectangle(10, 5);
    System.out.println("Area: " + rect.getArea());
    System.out.println("Perimeter: " + rect.getPerimeter());
    System.out.println("Diagonal length: " + rect.getDiagonalLength());
  }
}
