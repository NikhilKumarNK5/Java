//Sorting of Random numbers upto 100000
import java.lang.*;
public class DemoRan {
 
    public static void main(String[] args) {
 
        int myRandomArray1[] = new int[10];
 
        int myRandomArray2[] = new int[1000];
 
        int myRandomArray3[] = new int[1000000];
 
        count(myRandomArray1);
        selectionSort(myRandomArray1);
        printArray(myRandomArray1);
         
        System.out.println("The original order is: ");
         
        countT(myRandomArray2);
        selectionSortT(myRandomArray2);
        printArrayT(myRandomArray2);
         
        System.out.println("----------------------");
         
        countM(myRandomArray3);
        selectionSortM(myRandomArray3);
        printArrayM(myRandomArray3);
 
    }
 
    public static void count(int[] value) {
        System.out.println("The original order is: ");
        for (int i = 0; i < value.length; i++) {
            value[i] = (int) (Math.random() * 10);
        }
 
        for (int j = 0; j < value.length; j++) {
            System.out.println(value[j]);
        }
    }
 
    public static void selectionSort(int[] array) {
        int startScan, index, minIndex, minValue;
        for (startScan = 0; startScan < (array.length - 1); startScan++) {
            minIndex = startScan;
            minValue = array[startScan];
            for (index = startScan + 1; index < array.length; index++) {
                if (array[index] < minValue) {
                    minValue = array[index];
                    minIndex = index;
                }
            }
            array[minIndex] = array[startScan];
            array[startScan] = minValue;
        }
 
    }
 
    public static void printArray(int[] value) {
        System.out.println("The sorted values are:");
        for (int i = 0; i < value.length; i++)
            System.out.print(value[i] + " ");
        System.out.println();
    }
 
    public static void countT(int[] value) {
         
        for (int i = 0; i < value.length; i++) {
            value[i] = (int) (Math.random() * 10);
        }
 
        for (int j = 990; j < value.length; j++) {
            System.out.println(value[j]);
        }
    }
 
    public static void selectionSortT(int[] array) {
        int startScan, index, minIndex, minValue;
        for (startScan = 0; startScan < (array.length - 1); startScan++) {
            minIndex = startScan;
            minValue = array[startScan];
            for (index = startScan + 1; index < array.length; index++) {
                if (array[index] < minValue) {
                    minValue = array[index];
                    minIndex = index;
                }
            }
            array[minIndex] = array[startScan];
            array[startScan] = minValue;
 
        }
 
    }
 
    public static void printArrayT(int[] value) {
        System.out.println("The sorted values are:");
        for (int i = 0; i < 10; i++)
            System.out.print(value[i] + " ");
        System.out.println();
    }
 
    public static void countM(int[] value) {
        System.out.println("The original order is: ");
        for (int i = 0; i < value.length; i++) {
            value[i] = (int) (Math.random() * 10);
        }
 
        for (int j = 999990; j < value.length; j++) {
            System.out.println(value[j]);
        }
    }
 
    public static void selectionSortM(int[] array) {
        int startScan, index, minIndex, minValue;
        for (startScan = 0; startScan < (array.length - 1); startScan++) {
            minIndex = startScan;
            minValue = array[startScan];
            for (index = startScan + 1; index < array.length; index++) {
                if (array[index] < minValue) {
                    minValue = array[index];
                    minIndex = index;
                }
            }
            array[minIndex] = array[startScan];
            array[startScan] = minValue;
 
        }
 
    }
 
    public static void printArrayM(int[] value) {
        System.out.println("The sorted values are:");
        for (int i = 0; i < 10; i++)
            System.out.print(value[i] + " ");
        System.out.println();
    }
 
}