import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arr[]=new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter value of element at " + i +" th position:");
            arr[i] = sc.nextInt();
        }
        insertionSort(arr);
        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int [] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }else{
                    break;
                }
            }
        }
    }
}
