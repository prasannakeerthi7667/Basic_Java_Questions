package basicjavaquestions;

import java.util.Scanner;

public class PalindromeNumberorNOt {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number");
        
        int number=sc.nextInt();
        int sum=0;
        int reversedNumber=number;
        for(;number>0;number/=10){
            int rem=number%10;
            sum=sum*10+rem;
        }
        if(sum==reversedNumber){
        System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        sc.close();
    }

}
