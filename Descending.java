package basicjavaquestions;
import java.util.Arrays;
import java.util.Collections;

public class Descending {
    public static void main(String[] args) {
        Integer[] arr={1,2,3,4,5};
        Arrays.sort(arr,Collections.reverseOrder());
        for(int num:arr){
            System.out.println(num);

        }
    }
    
}
