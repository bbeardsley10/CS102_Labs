package lab07.lab07a;

public class mainClass {

    public static void binarySearch(int arr[], int first, int last, int key)
    {
        //sets the value for mid by finding out how many elements there are in the array and then dividing that number by 2
        int mid = (first + last)/2;

        //sets up while loop that will continue as long as the first element is less than or equal to the last element
        while(first <= last)
        {
            //If the array is sorted and the element at mid is less than the key than it will execute the following statement
            if(arr[mid] < key)
            {
                //The first value will be changed to the value of mid + 1
                first = mid + 1;
              //Statement that sees if mid element is equal to the key value
            } else if (arr[mid] == key)
            {
                //Prints out that the key value was found in the array and the index it was found at. 
                System.out.println("Element is found at index " + mid);
                break;
            } else {
                //If it gets to this statement the last index value will be changed to the mid index - 1
                last = mid -1;
            }
            //This statement sets the value of mid by find out how many elements there are and dividing it by two
            mid = (first + last)/2;
        }

        /*
         * If the value of the first is greater than the value of the last then it is going to print out that the element wasn't found in the array
         * 
         * It keeps looping through and checking to see if the key value is found.
         * 
         * If the value isn't found than it keeps adding one to first until the value finally gets larger than the last value that doesn't change throughtout the loop
         * 
         * Once first is finally larger than the following print statement is executed
         */
        if(first > last){
            System.out.println("Element is not found!");
        }
    }

    public static void main(String[] args) {
        //the creation of the array
        int arr[] = {10, 20, 30, 40, 50};

        //sets up the value for the int key that we are ultimately looking for in the array
        int key = 40;

        //this sets the value of the int last as the end of the array
        int last = arr.length-1;
        
        //This just calls the binarSearch function that we created above
        binarySearch(arr, 0, last, key);
    }
}