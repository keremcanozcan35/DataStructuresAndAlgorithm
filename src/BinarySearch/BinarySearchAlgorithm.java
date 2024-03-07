package BinarySearch;

// inside of main
// int[] array =  new int [100];
//        int target =42;
//
//        for(int i = 0 ; i < array.length ; i++){
//            array[i] = i;
//        }
//
//        int index = binarySearch(array, target);
//
//        if(index == -1) {
//            System.out.println(target + " not found");
//        }else{
//            System.out.println("Element found at: " + index);
//        }
public class BinarySearchAlgorithm {
    public static int binarySearch(int[] array, int target){
        int low = 0;
        int high= array.length -1;

        while(low <= high){
            int middle = low + (high-low) / 2;
            int middle2 = array[middle];

            System.out.println("middle: " + middle2);
            if (middle2 < target){
                low = middle2 + 1;
            }else if(middle2 > target){
                high = middle2 - 1;
            }else
                return middle2;
        }

        return -1;
    }
}

// O(log n )