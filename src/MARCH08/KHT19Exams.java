package MARCH08;

import java.util.Arrays;

public class KHT19Exams {
    public static void main(String[] args) {
        int [] x ={4,7,2,44,66,9,5};
        System.out.println(Arrays.toString(processArray(x)));
    }
    public static int[] processArray(int arr[]){
        int[] x = new int [3];
        Arrays.sort(arr);
        for(int i=0;  i<3;  i++){
            x [i] =arr[i];
        }
        return x;
    }
}
