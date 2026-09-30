package basicProblems;

public class ArrayProblem2 {
    public static int[] revserArr(int[] arr){
        int n = arr.length;
        int  i = 0;
        int j = n-1;
        while (i<=j) {
            int tempElement = arr[i];
            arr[i] = arr[j];
            arr[j]  = tempElement;
            i++;
            j--;

        }
        return arr;
    }
    static boolean displayArr(int[] arr){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+ "  ");
        }
        return false;
    }
    static int[] shiftElement(int[] arr){
        int n = arr.length;
        int i = 0;
        int temp = arr[i];

        while ((n-2)>i){
            arr[i+1] = temp;
            i++;
            temp = arr[i+1];

            if(i == n-1){
                arr[0] = arr[n-1];
            }
        }



        return arr;
    }


    static void main(String[] args) {
        int[] arr = {1,2,34,5,76,45,334,657,6};
        int[] brr = {10,20,30,40,50,60,70};
        int[] reverseArr = revserArr(arr);
        displayArr(reverseArr);
        System.out.println();
        int[] shiftarr = shiftElement(brr);
        displayArr(shiftarr);
    }
}
