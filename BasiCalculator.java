package basicjavaquestions;

public class BasiCalculator {
   
        public int add;
        public int sub;
        public int mul;
        public int div;

        int a;
        int b;

        public void setAdd(int a,int b){
            add=a+b;
        }
        public void setSub(int a,int b){
            sub=a-b;
        }
        public void setMul(int a,int b){
            mul=a*b;
        }
        public void setDiv(int a,int b){
            div=a/b;
        }
        public int getAdd(){
            return add;
        }
         public int getSub(){
            return sub;
        }
 public int getDiv(){
            return mul;
        }
 public int getMul(){
            return div;
        }
        public static void main(String[] args) {
            BasiCalculator BC=new BasiCalculator();
            BC.setAdd(1,2);
            System.out.println(BC.getAdd());
            BC.setSub(1,2);
            System.out.println(BC.getSub());
            BC.setMul(1,2);
            System.out.println(BC.getMul());
            BC.setDiv(1,2);
            System.out.println(BC.getDiv());


        }


        
    }
    
