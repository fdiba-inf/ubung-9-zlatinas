package exercise9;

public class Ellipse {
  private Point startPoint;
  private double x;
  private double y;

  public Ellipse(){
    startPoint = new Point(0, 0);
    x = 1;
    y = 1;
  }

  public Ellipse(Point startPoint, double a, double b){
    this.startPoint = new Point(startPoint);
    this.x = x;
    this.y = y;
  }
public Ellipse(Ellipse otherEllipse) {
        startPoint = new Point(otherEllipse.startPoint);
        x = otherEllipse.x;
        y = otherEllipse.y;
}

public boolean isValid() {
  return x > 0 && y > 0;
}

public void initialize(){
  do {
            System.out.println("Start point: ");
            startPoint.initialize();
            System.out.print("Enter a: ");
            x = Utils.INPUT.nextDouble();
            System.out.print("Enter b: ");
            y = Utils.INPUT.nextDouble();
        } while (!isValid());
}

public double calculatePerimeter(){
  return Math.PI * (3 * (x + y) - Math.sqrt((3 * x + y)* (x + 3 * y)));
}

public double calculateArea(){
  return Math.PI * x * y;
}

 public String getType() {
        return (x == y) ? "Circle" : "Ellipse";
 }

 public String toString() {
        return String.format("%s-[%s, %s], %s, P=%s, A=%s", startPoint, x, y, getType(), calculatePerimeter(), calculateArea());
    }

  
 public boolean equal(Ellipse otherEllipse) {
        boolean sameX = Utils.equals(x, otherEllipse.x);
        boolean sameY = Utils.equals(y, otherEllipse.y);
        boolean sameXReversed = Utils.equals(x, otherEllipse.y);
        boolean sameYReversed = Utils.equals(y, otherEllipse.x);

        return (sameX && sameY) || (sameXReversed && sameYReversed);
    }



  

}