public class OddOrEven {
  //Check if a no. is ODD OR EVEN
    public static void oddOREven(int n){
        int bitMask=1;
        if((n&bitMask)==0){
            //even number
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }
        }
        public static void main(String[] args) {
            oddOREven(5);
            oddOREven(6);
            oddOREven(11);
    }
}
