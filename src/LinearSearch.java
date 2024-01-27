public class LinearSearch {
    // Time: O(n)
    // Space: O(1)
    public static int linearSearch(int[] arr,int len,int key){
        for (int i = 0; i < len ; i++) {
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
}
