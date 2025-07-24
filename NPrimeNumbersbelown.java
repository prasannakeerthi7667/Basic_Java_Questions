package basicjavaquestions;

import java.util.Scanner;

public class NPrimeNumbersbelown {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int number=sc.nextInt();
        for(int j=2;j<number;j++){
            int count=0;
            for(int i=2;i<=j-1;i++){
            if(j%i==0){
                count=1;
                break;
            }

        }
        if(count==0){
            System.out.println(j);
        }
        
        }
        sc.close();
    }
}
        