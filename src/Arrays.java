import java.util.Scanner;

public class Arrays {
    static int[] storeArrays(int numArr){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[numArr];
        for (int i = 0 ; i< numArr;i++){
            System.out.print("Enter your Array value:- ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    static void sumElement(int array[]){
        int result = 0;
        for (int i=0; i < (array.length) ;i++){
            result = result + array[i];
        }
        System.out.print("Here is the Sum for all the element in array :-");
        System.out.println(result);
    }
    static void displArray(int array[]){
        for (int i = 0 ; i < (array.length);i++){
            System.out.println("Here is te value of your Array "+i+" = "+array[i]);
        }
    }
    static void multArray(int array[]){
        int result = 1;
        for (int i = 0;i<(array.length);i++){
            result = result*array[i];
        }
        System.out.print("Here is the Multiplication for all the element in array :-");
        System.out.println(result);
    }
    static void findMax(int array[]){
        int  result = 0;
        for (int i = 1 ;i<(array.length);i++){
            if (array[i-1]>array[i]){
                if (result<array[i-1]){
                    result = array[i-1];
                }
            }
            else if (array[i]>array[i-1]){
                 if (result<array[i]){
                    result = array[i];
                }
            }
        }
        System.out.println("Here is the maximum Value in your array : -" + result);
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int arr[];
        // arr =  new int[5];
        // int brr[] = {10,20,30};
        // System.out.println("Value of the Indexikng - "+ brr[0]);
        // System.out.println("Value of the Indexikng - "+ brr[1]);
        // System.out.println("Value of the Indexikng - "+ brr[2]);
        // Using tranverse Array using loop
        // for (int i = 0 ; i< (brr.length);i++){
        //     System.out.println("Value of the Indexikng - "+ brr[i]);

        // } 
        // // Different way of  loop
        // for (int val : brr){
        //     System.out.println("Value of the Indexikng - " + val);
        // }
        System.out.print("Enter the Lenght of the list :- ");
        int numArr = sc.nextInt();
        int arr1[]  = {10,20,30,40,50};
        try {
            int arr2[] = storeArrays(numArr);
            displArray(arr2);
            sumElement(arr2);
            multArray(arr2);
            findMax(arr2);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Next Array start from here ");
        System.out.println();
        System.out.println();
        displArray(arr1);
        sumElement(arr1);
        multArray(arr1);
        findMax(arr1);

    }
}
