package basicjavaquestions;
import java.util.Scanner;

public class hexToOct {
    public static void main(String[] args) {
            
            Scanner sc=new Scanner(System.in);
            String hex=sc.nextLine();

            int decimal=Integer.parseInt(hex,16);
            String oct=Integer.toOctalString(decimal).toUpperCase();
            
        
                System.out.println(oct);
                
            }
            
        }
        



    
    

