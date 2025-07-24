package basicjavaquestions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=sc.nextInt();
        int Fact=1;
        for(;number>0;number--){
            Fact=Fact*number;
            }

        System.out.println(Fact);
    }
    
}
