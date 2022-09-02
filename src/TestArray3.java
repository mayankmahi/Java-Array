// Passing Array to a method

// To Method
public class TestArray3 {
//    Creating an array which receives an array as a Parameter.
    static void min(int arr[]){
        int min=arr[0];
        for(int i =1; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
    public static void main(String args[]){
        int a[] = {2,4,3}; // Declaring array
        min(a); // Passing array to method
    }
}
