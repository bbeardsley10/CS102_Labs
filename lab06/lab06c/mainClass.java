package lab06.lab06c;

public class mainClass {
    
    public static void main(String[] args) {
        
        /*Logical Error Exercise */

        
        int a = 2, b = 8, c = 6;
        System.out.println("Finding the largest number\n");

        if( a > b && a > c)
        {
            System.out.println(a + " is the largest number");
        } else if(b > a && b > c)
        {
            System.out.println(b + " is the largest number"); // it was showing smallest number instead of the largest number (just a simple overlooked erro)
    
        } else {
            System.out.println(c + " is the largest number");
        }
    }
}
