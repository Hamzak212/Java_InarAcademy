/*
    Suppose the weekly hours for all employees are stored in a two-dimensional array.
    Each row records an employ-ee’s seven-day work hours with seven columns.
    For example, the following array stores the work hours for eight employees.
    Write a program that displays employees and their total hours in decreasing
    order of the total hours
*/
import java.util.*;
public class Exercise_08_04 {
    public static void main(String[] args) {

        int[][] hours = {               // EMPLOYEE
                { 2, 4, 3, 4, 5, 8, 8}, //0
                { 7, 3, 4, 3, 3, 4, 4}, //1
                { 3, 3, 4, 3, 3, 2, 2}, //2
                { 9, 3, 4, 7, 3, 4, 1}, //3
                { 3, 5, 4, 3, 6, 3, 8}, //4
                { 3, 4, 4, 6, 3, 4, 4}, //5
                { 3, 7, 4, 8, 3, 8, 4}, //6
                { 6, 3, 5, 9, 2, 7, 9}  //7
        //DAY     S ,M ,T ,W ,T ,F ,S
        };

        // total hours put into array
        int[] totalHoursPerEmployee = sumEmployeeHours(hours);
        // person # put into array
        int[] indexList = new int[totalHoursPerEmployee.length];
        //sorting the hours in decreasing order
        sort(totalHoursPerEmployee, indexList);

        for (int i = 0; i < totalHoursPerEmployee.length; i++) {
            System.out.printf("Employee %s worked %d hours%n", (indexList[i] + 1), totalHoursPerEmployee[i]);
        }

        System.out.println(java.util.Arrays.toString(indexList));
    }
    public static int[] sumEmployeeHours(int[][] hours){
        int[] totalHoursPerEmployee = new int[hours.length];
        for(int i = 0 ; i < hours.length; i++){
            int sum = 0;
            for(int j = 0; j < hours[i].length; j++){
                sum += hours[i][j];
            }
            totalHoursPerEmployee[i] = sum;
        }
        return totalHoursPerEmployee;
    }
    public static void sort(int[] totalHours, int[] indexList){
        // int[] totalHoursPerEmployee = sumEmployeeHours(hours)
        // int[] indexList = new int[totalHoursPerEmployee.length];

        //put 7 employees in array
        for(int i = 0; i < indexList.length; i++){
            indexList[i] = i;
        }

        for(int i = 0; i < totalHours.length; i++){
            int currentMax = totalHours[i];
            int maxIndex = i;
            for(int j = i + 1; j < totalHours.length; j++){
                if(currentMax < totalHours[j]){
                    currentMax = totalHours[j];
                    maxIndex = j;
                }
            }
            if(maxIndex != i){
                totalHours[maxIndex] = totalHours[i];
                totalHours[i] = currentMax;

                int temp = indexList[maxIndex];
                indexList[maxIndex] = indexList[i];
                indexList[i] = temp;
            }

            System.out.println(java.util.Arrays.toString(indexList) + " - " + java.util.Arrays.toString(totalHours));

        }
    }
}

