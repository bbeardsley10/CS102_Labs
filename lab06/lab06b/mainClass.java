package lab06.lab06b;

public class mainClass {
    
    /*Run-time Error Exercise */

    public static void main(String[] args) {
        
        int arr[] = new int[5];

        //arr[9] = 250; //The location of 9 is out of the range for the array which is set at [5] the highest you can go when assigning values would be [4]


        //Working Solution
        arr[4] = 250;
        System.out.println("Value assigned! ");

        // Set in place just to check the value that was set in arr[4]
        System.out.println(arr[4]);
    }
}
