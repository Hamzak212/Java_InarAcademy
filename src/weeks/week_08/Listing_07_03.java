import java.util.Arrays;
import java.util.Scanner;
public class Listing_07_03 {
    public static void main(String[] args) {
        int[] MyArray = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Before Invoking Method -> \n[0] = " + MyArray[0] + "\n[1] = " + MyArray[1]);
        swap(MyArray);
        System.out.println("After Invoking Swap -> \n[0] = " + MyArray[0] + "\n[1] = " + MyArray[1]);
        System.out.println("After Invoking Flip -> \n[Array] = " + Arrays.toString(reverse(MyArray)));
    }
    public static void swap(int[] array){
    int temp = array[0];
    array[0] = array[1];
    array[1] = temp;
    }
    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];
        for(int i = 0,  j = list.length - 1; i < list.length; i++, j--){
        result[j] = list[i];
        }
        return result;
    }
}
