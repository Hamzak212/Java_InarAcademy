import java.util.*;
public class Exercise_08_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number of Rows and Columns: ");
        int rows = input.nextInt();
        int columns = input.nextInt();
        double[][] array = new double[rows][columns];
        getArray(array);
        int[] location = findLargest(array);
        printArray(array);
        System.out.println("The location of the largest element is at (" + location[0] + ", " + location[1] + ")");

    }
    public static void getArray(double[][] array){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array: ");
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                array[i][j] = input.nextDouble();
            }
        }
    }
    public static int[] findLargest(double[][] array){
        double max = 0;
        int[] location = new int[2];
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                if(array[i][j] > max){
                    max = array[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }
    public static void printArray(double[][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

