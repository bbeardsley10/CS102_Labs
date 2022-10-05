
package lab05.lab05a;

/**
 * MainClass
 */
public class MainClass {

    public static void main(String[] args) {
       int[] inputArray = {1, 2, 3, 4, 5};
       
        //Testing the value of 3
        int key = mySearch(inputArray, 3);
        System.out.println(key);
        
        //Testing the value of 0
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