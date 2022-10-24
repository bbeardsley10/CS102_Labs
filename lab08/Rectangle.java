package lab08;

public class Rectangle {
  
  int width;
  int height;
  boolean filled;

  public Rectangle(int width, int height, boolean filled)
  {
    this.width = width;
    this.height = height;
    this.filled = filled;
  }

  
  public void draw()
  {
    /*
     * This is the implementation for the extra credit for creating a rectangle that is unfilled
     */
    if(filled == false)
    {
      for(int i = 0; i < height; i++)
      {
        for(int j = 0; j < width; j++)
        {
          if(i == 0 || i == height-1 || j == 0 || j == width-1)
            {
              System.out.print("*");
            } else{
              System.out.print(" ");
            }
        }
        System.out.println();
      }
    }
    /*
     * This is the default filled rectangle method
     */
    else{
      for(int i = 0; i < height; i++)
      {
        for(int j = 0; j < width; j++)
        {
          System.out.print("*");
        }
        System.out.println("");
      }
    }
  }
}

