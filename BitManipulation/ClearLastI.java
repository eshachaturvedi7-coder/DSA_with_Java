public class ClearLastI {
    public static int clearLastIbits(int n, int i){
        int bitMask =(~0)<<i;
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.print(clearLastIbits(15, 2));
    }
}
