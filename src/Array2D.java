import java.util.Scanner;
public class Array2D {
    static void display(int[][] arr){
        for (int row=0;row<arr.length;row++){
                for(int col = 0;col<arr[row].length;col++){
                    System.out.print("Here is the value of row "+ row + " and column "+ col + " :--");
                    System.out.println(arr[row][col]);
                    System.out.print(" ");
                }
                System.out.println("");
            }
        }
    static int[][] inputArr(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of row:--");
        int arrRow = sc.nextInt();
        System.out.print("Enter the Number of col:--");
        int arrCol = sc.nextInt();
        int[][]arr = new int[arrRow][arrCol];
        for(int row = 0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.print("Enter the value of row "+ row + " and column "+ col + " :--");
                arr[row][col] = sc.nextInt();
                System.out.print("");
            }
            System.out.println("");
        }
        sc.close();
        return arr;
    }
    static int sumArr(int[][] arr){
        int result = 0;
        for(int row = 0 ;row<arr.length;row++){
            for(int col = 0;col<arr[row].length;col++){
                result = result + arr[row][col];
            }
        }
        return result;
    }
    static int mulArr(int[][] arr){
        int result = 1;
        for(int row = 0 ;row<arr.length;row++){
            for(int col = 0;col<arr[row].length;col++){
                result = result * arr[row][col];
            }
        }
        return result;
    }
    static int maxElement(int[][] arr){
        int maxElement = arr[0][0];
        for (int row = 0;row<arr.length;row++){
            for(int col =0 ; col<arr[row].length;col++){
                if (maxElement<arr[row][col]){
                    maxElement=arr[row][col];
                }
            }
        }
        return maxElement;
    }
    static int minElement(int[][] arr){
        int minElement = arr[0][0];
        for (int row = 0;row<arr.length;row++){
            for(int col =0 ; col<arr[row].length;col++){
                if (minElement>arr[row][col]){
                    minElement=arr[row][col];
                }
            }
        }
        return minElement;
    }
    public static void main(String[] args) {
        // Creating 2d Array/Matrix//
        int[][] arr = {{1,2,3},{12,23,33},{14,25,36},{17,24,39}};
        // Display of the 2d Array
        for(int i = 0; i<4;i++){
            for(int j = 0; j<3;j++){
                System.out.println(arr[i][j]);
            }
        }
        // jacked Array
        int[][] jacked_arr = {
            {1,2,3},
            {4,5,6,7,8,9,2},
            {1,8,5,6,102},
            {2,2},
            {-5}
        };
        System.out.println("Disply of the jacked array:--");
        // Display of the Jackred arr 
        for (int row=0;row<jacked_arr.length;row++){
            for(int col = 0;col<jacked_arr[row].length;col++){
                System.out.println(jacked_arr[row][col]);
            }
            System.out.println("");
        }
        System.out.println("Storing and printing the arr using the methods");
        int maxValue = maxElement(jacked_arr);
        int minValue = minElement(jacked_arr);
        System.out.println("Here is the Max Value of the jacked Array :--" + maxValue);
        System.out.println("Here is the Min Value of the jacked Array :--" + minValue);
        int[][] arr2d = inputArr();
        display(arr2d);
        int sumOfArr = sumArr(arr2d);
        System.out.println("Here is sum of Your 2d Array:-- "+ sumOfArr);
        int mulOfArr = mulArr(arr2d);
        System.out.println("Here is sum of Your 2d Array:-- "+ mulOfArr);
    }
}
