import java.util.*;
public class MatrixSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows and columns you want in array");
        int r=sc.nextInt();
        int c= sc.nextInt();
        int [][] arr=new int[r][c];
        for (int i=0;i<r;i++){
            System.out.println("Enter elements in "+i+" row");
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter target value");
        int target= sc.nextInt();
        int[]res=search(arr,target);
        System.out.println(Arrays.deepToString(arr));
        System.out.println("Element found at "+Arrays.toString(res));
    }
    static int[] search(int[][]arr,int target){
        int r=0,c=arr[0].length-1;
        while(r<arr.length&&c>=0){
            if(arr[r][c]==target){
                return new int[]{r,c};
            }
            if(arr[r][c]<target){
                r++;
            }else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}