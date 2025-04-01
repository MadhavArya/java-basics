import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arr[]=new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter value of element at " + i +" th position:");
            arr[i] = sc.nextInt();
        }
        selectionSort(arr);
        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            int last= arr.length-i-1;
            int maxIndex=getMax(arr,0,last);
            int temp=arr[maxIndex];
            arr[maxIndex]=arr[last];
            arr[last]=temp;
        }
    }
    private static int getMax(int[] arr,int start, int end){
         int max=start;
        for (int i = start; i <=end; i++) {
            if (arr[max] < arr[i]) {
                max=i;
            }
        }
        return max;
    }
}
