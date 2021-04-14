import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class App {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int number = 5;
        System.out.println("Hello, World!");
        System.out.println("Enter "+number + "numbers = /r");
        //Input
        int[] outputArray = getInteger(number);
        printArray(outputArray);
        
        int[] sortArray = sortIntegers(outputArray);
        printArray(sortArray);
    }

    public static int[] getInteger(int number){
        int[] myArray = new int[number];
        for (int i=0;i<myArray.length;i++){
            myArray[i]=scanner.nextInt();
        }
        return myArray;
    }

    public static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.println("Element "+i+" = "+ array[i]);
        }
    }

    /* public static Integer[] sortIntegers(Integer[] array){
        Arrays.sort(array, Collections.reverseOrder());
        return array;
    } */

    public static int[] sortIntegers(int[] myArray){
 
        boolean flag = true;
        int temp;
        
        while(flag){
            flag=false;
            
            for(int i=0; i< myArray.length-1; i++){
                if(myArray[i] < myArray[i+1]){
                    temp = myArray[i];
                    myArray[i] = myArray[i+1];
                    myArray[i+1] = temp;
                    flag = true;
                }
            }
        }    
        return myArray;
    }
}
