package basicjavaquestions;
import java.util.Scanner;

public class Stringpalindromeornot {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Word");
        String Word=sc.nextLine();
        int len=Word.length();
        String updatedword="";
        for(int i=len-1;i>=0;i--){
           updatedword+=Word.charAt(i);

        }
        
        if(Word.equals(updatedword)){
        System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
    
}
