package basicjavaquestions;
import java.util.Scanner;

public class OctToBin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String Octal=sc.nextLine();
        int decimal=Integer.parseInt(Octal,8);
        String bin=Integer.toBinaryString(decimal);
        System.out.println(bin);
        
    }
    
}
