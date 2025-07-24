package basicjavaquestions;
import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("please enter "+i+" value");
            arr[i]=sc.nextInt();
        }
       

        int[] arr2 = new int[size];
        int index =0;
        for(int i =0; i<arr.length; i++) {
            boolean isPresent = false;
            int arrvalue = arr[i];

            for(int j=0;j<arr2.length;j++){
                int arr2value = arr2[j];
                if(arrvalue == arr2value){
                    isPresent =true;
                    break;
                }
            }

            if(isPresent == false) {
                arr[index]=arrvalue;
                index++;
            }
            
        }
        



    }
    

    
}
