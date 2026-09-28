package basicProblems;

import java.util.Arrays;

public class ArrayProblem {
    public  static double getAverage(int[] arr){
        double sum = 0;
        for(int i: arr){
            sum+= i;

        }
        int size = arr.length;
        double avg= sum/size;
        return avg;
    }
    public static  int[] multiArray(int[] arr){
        int size = arr.length;
        int[] newArr = new int[size];
        for (int i = 0;i<size;i++) {
                int element = arr[i];
                int newElement = 10*element;
                newArr[i] = newElement;
        }
        return newArr;
    }
    public static boolean searchElement(int[] arr, int num){
        for(int i=0;i<arr.length;i++){
            if(num==arr[i]){
                return true;
            }
        }
        return false;
    }
    static int maxElement(int[]arr){
        int max = arr[0];
        for(int i = 0;i<arr.length;i++ ){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    static int minElement(int[]arr){
        int min = arr[0];
        for(int i = 0;i<arr.length;i++ ){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    static int sumPositive(int[] arr){
        int sum = 0;
        for (int i=0;i<arr.length;i++ ){
            if(arr[i]>0){
                sum += arr[i];
            }
        }

        return sum;
    }
    static int sumNegative(int[] arr){
        int sum = 0;
        for (int i=0;i<arr.length;i++ ){
            if(arr[i]<0){
                sum += arr[i];
            }
        }

        return sum;
    }
    static int countZero(int[] arr ){
        int count = 0;
        for(int i = 0 ; i<arr.length;i++){
            if(arr[i]==0){
                count+=1;
            }
        }
        return count;
    }
    static int countOnes(int[] arr ){
        int count = 0;
        for(int i = 0 ; i<arr.length;i++){
            if(arr[i]==1){
                count+=1;
            }
        }
        return count;
    }
    static void main(String[] args) {
        int[] arr = {2,1,3,4,5,6,4,54,34,5,423,54,6,52,3,2,65,3,4};
        int[] arr1 = {1,0,1,1,0,2,1,0};
        System.out.println(getAverage(arr));
        System.out.println(Arrays.toString(multiArray(arr)));
        System.out.println(searchElement(arr,54));
        System.out.println(maxElement(arr));
        System.out.println(minElement(arr));
        System.out.println(sumPositive(arr));
        System.out.println(sumNegative(arr));

    }
}
