import java.util.*;
public class bubbleSort {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arr[]=new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter value of element at " + i +" th position:");
            arr[i] = sc.nextInt();
        }
        BubbleSort(arr);
        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(arr));

    }
    static void BubbleSort(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }

        }
    }
}
