package basicjavaquestions;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=sc.nextInt();
        String numberstr=Integer.toString(number);
        int number1=numberstr.length();
        int value=0;
        for(int i=0;i<=number1-1;i++){
            value+=(int)Math.pow((numberstr.charAt(i)-'0'),number1);
        }
        if(value==number){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not an armstrong number");
        }
        sc.close();
    }
 
    
}
