package basicjavaquestions;

import java.util.Scanner;

public class Neon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=sc.nextInt();
        int power=(int)Math.pow(number,2);
        String number1=Integer.toString(power);
        int len=number1.length();
        int sum=0;
        for(int i=0;i<len;i++){
            int digit=number1.charAt(i)-'0';
            sum+=digit;

        }
        if(sum==number){
        System.out.println("Neon Number");
        }
        else{
            System.out.println("Not a Neon Number");
        }
        
    }
    
}
