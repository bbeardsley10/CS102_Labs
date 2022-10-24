package lab08;

public class mainClass {

  public static void main(String[] args) {
    
    Rectangle r1 = new Rectangle(5, 8, true);
    r1.draw();

    Rectangle r2 = new Rectangle(8, 5, false);
    r2.draw();

    Rectangle r3 = new Rectangle(3, 3, false);
    r3.draw();
  }

}
