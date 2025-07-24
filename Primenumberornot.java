package basicjavaquestions;

import java.util.Scanner;

public class Primenumberornot {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int number=sc.nextInt();
        int count=0;
        for(int i=2;i<=number-1;i++){
            if(number%i==0){
                count=1;
                break;
            }

        }
        if(count==1){
            System.out.println("Not a Prime number");
        }
        else{
            System.out.println(" Prime Number");
        }
        sc.close();
    }

    
}
