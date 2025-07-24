package basicjavaquestions;

import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Please enter array size : ");
        n = sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Please enter array elements : ");

        for (int i=0; i<arr.length;i++){
            System.out.println("please enter " + i+ " value");
            arr[i] = sc.nextInt();
        }

        System.out.println("inserted successfully.");

        for (int value  : arr) {
            System.out.println(" value is "+value);
        }
        
        int min=arr[0];
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
    
}
