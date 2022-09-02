//Passing Anonymous Array to method

public class TestAnonymousArray {
//    Creating Method to receive array as a parameter.
        static void printArray(int arr[]){
            for(int i = 0; i < arr.length; i++){
                System.out.println(arr[i]);
            }
        }

        public static void main(String args[]){
            printArray(new int[]{2,3,4,5});
        }
}
