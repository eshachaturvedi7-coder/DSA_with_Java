public class Q2 {
    //check if a number is power of two or not
    public static boolean isPowerofTwo(int n){
        return (n & (n - 1)) == 0;
    }
    public static void main(String[] args) {
        System.out.println(isPowerofTwo(8));
    }
}
