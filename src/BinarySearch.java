public class BinarySearch {

    // Time: O(log n)
    // Space: O(number of binary search calls - worst is log n)
    public static int binarySearch(int[] arr, int end, int key, int start){
        if(start <= end){
            int middle = start + (end-start) /2;

            if(arr[middle] == key){
                return middle;
            }

            else if(arr[middle] < key){
                return binarySearch(arr,end,key,start+1);
            }

            else {
                return binarySearch(arr,end-1,key,start);
            }

        }

        return -1;

    }
}
