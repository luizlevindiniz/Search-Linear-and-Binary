import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int [] input = new int[]{1123,42,5346,734,24,652,52,9,31,10};
        int length = input.length;

        int key = 5346;

        int indexByLinear = LinearSearch.linearSearch(input,length,key);

        int [] input_binary = Arrays.stream(input).sorted().toArray();
        // [9, 10, 24, 31, 42, 52, 652, 734, 1123, 5346]
        int indexByBinary = BinarySearch.binarySearch(input_binary,length,key,0);

        System.out.println("Index = " + indexByLinear);
        System.out.println("Index = " + indexByBinary);
    }
}