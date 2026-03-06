public class Code9 {
    // check if a number is prime or not
    public static boolean isPrime(int n){
        boolean isPrime= true;
        for(int  i=2 ; i<=n-1 ; i++) {
            if(n % i == 0) { //  completely dividing 
                return false;
            }
        }
        return isPrime;
    }
    public static void main(String args[]){
        System.out.println(isPrime(5));
    }
}
