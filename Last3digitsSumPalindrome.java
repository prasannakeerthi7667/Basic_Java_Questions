package basicjavaquestions;

import java.util.Scanner;
public class Last3digitsSumPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//for taking input from user
        int number=sc.nextInt();//eg:123
        int number1=(number%(int)(Math.pow(10,3)));
        String number2=Integer.toString(number1);
        int sum=0;
        for(int i=0;i<3;i++){
            sum=sum+number2.charAt(i)-'0';

    }
    System.out.println(sum);

    
    }
}
