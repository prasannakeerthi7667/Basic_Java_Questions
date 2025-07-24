package basicjavaquestions;

public class PatternFibonocci {
     
    public static void main(String[] args) {
        int a=0;
        int k=1;
        int fib=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
            
            System.out.print(a+" ");
            fib=a+k;
            a=k;
            k=fib;
            }
            System.out.println();

        }

        

        
    }
    
}




    

