package Basic1to3;
public class TestShape {
   public static void main(String[] args) {

      Circle circle;
      Square square;

      circle = new Circle( new Point(22, 8), 3.5 );
      square = new Square( new Point(7.5, 2), 18 );

      System.out.print(circle.getName() +
                            ": " + circle.toString());
      System.out.println("; Area = " + circle.getArea());

      System.out.print(square.getName() +
                            ": " + square.toString());
      System.out.println("; Area = " + square.getArea());
   }
}
