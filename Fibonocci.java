package basicjavaquestions;



public class Fibonocci {
    public static void main(String[] args) {
        int j=0;
        int k=1;
        int fib=0;
        System.out.println(j);
        for(int i=0;i<100;i++){
            fib=j+k;
            System.out.println(fib);
            j=k;
            k=fib;

        }

        

        
    }
    
}
