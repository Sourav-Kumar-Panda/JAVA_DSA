import java.util.Arrays;

public class Basic{
    public static void main(String[] args) {
        // datatype[] array_name = new datatype[size_of_array];
        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i] = i+1;
        }
        System.out.println(Arrays.toString(arr));
    }
}