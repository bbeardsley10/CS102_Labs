
package lab05.lab05a;

/**
 * MainClass
 */
public class MainClass {

    public static void main(String[] args) {
       //int[] inputArray = new int[10];
       int[] inputArray = {1, 2, 3, 4, 5};
       //int key = 2;
       
       int key = mySearch(inputArray, 3);
        System.out.println(key);
        
        key = mySearch(inputArray, 0);
        System.out.println(key);
    }

    public static int mySearch(int[] inputArray, int n)

    {

        for(int i = 0; i < inputArray.length; i++)
        {
            if(inputArray[i] == n)
            {
                return i;
            }
        }
        return -1;
    }
}