package LinearSearch;

//        int[] array = {1,2,3,4,5,6,7,8,9};
//        for(int i = 0 ; i < array.length ; i++){
//            System.out.println( "At index: " + i +" our number is: " + array[i]);
//        }
//        int result = linearSearchAlgorithm(array, 2);
//        System.out.println("Our search number is " + 2 +" index at: " + result);
public class LinearSearchAlgorithm {
    public static int linearSearchAlgorithm(int[] array, int searchIndex){
        for (int i = 0; i < array.length; i++){
            if (array[i] == searchIndex){
                return i;
            }
        }
        return -1;
    }
}

// run time complexity : O(n)
// fast for small data set slow for big data sets
