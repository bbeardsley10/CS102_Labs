package lab08;

public class Rectangle {
  
  int width;
  int height;
  boolean filled;

  public Rectangle(int width, int height)
  {
    this.width = width;
    this.height = height;

  }

  
  public void draw()
  {
      for(int i = 0; i< height; i++)
      {
        for(int j = 0; j < width; j++)
        {
          System.out.print("*");
        }
        System.out.println("");
      }
  }
}
