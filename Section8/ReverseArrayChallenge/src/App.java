import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int[] myArray = {5,4,3,2,1};
        System.out.println(Arrays.toString(myArray));

        reverse(myArray);

        System.out.println(Arrays.toString(myArray));
    }

    private static void reverse(int[] array){
        int idx = array.length-1;
        for(int i = 0; i<(array.length/2); i++){
            int temp = array[i];
            array[i] = array[idx-i];
            array[idx-i]=temp;
        }
    }
}
