package lab05.lab05b;

import java.util.Arrays;

public class mainClass {
    
    public static void main(String[] args) {
        
        //First Array Tested
        //int[] inputArray = {1, 3, 2, 10, 7};

        //Second Array Tested 
        int[] inputArray = {20, -5, 0, -30, 25}; 
        
        //Third Array Tested
        //int[] inputArray = {};

         mySort(inputArray);
        System.out.println(Arrays.toString(inputArray));
       // int key = mySort(inputArray, 3);
    }

    public static void mySort(int[] inputArray)
    {
        int arraySize = inputArray.length;
        for(int i = 0; i< arraySize - 1; i++)
        {
            int index = i;
            for(int j = i + 1; j< arraySize; j++)
            {
                if(inputArray[j] < inputArray[index])
                {
                    index = j;
                }
            }
            int temp = inputArray[i];
            inputArray[i] = inputArray[index];
            inputArray[index] = temp;
        }
    }
}
