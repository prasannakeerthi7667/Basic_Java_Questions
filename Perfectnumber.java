package basicjavaquestions;

import java.util.Scanner;

public class Perfectnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=sc.nextInt();
        int value=0;
        for(int i=1;i<=number-1;i++){
            if(number%i==0){
                value+=i;
            }
        }
        if(value==number){
        System.out.println("perfect number");
        }
        else{
            System.out.println("Not a perfect number");
        }
        sc.close();
    }

    
}
