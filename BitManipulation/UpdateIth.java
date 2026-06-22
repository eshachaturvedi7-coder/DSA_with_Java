public class UpdateIth {
    
    public static int clearIthBit(int n, int i) {
        int mask = ~(1 << i);
        return n & mask;
    }
    
    public static int updateIthBit(int n, int i, int newBit) {
        newBit = newBit & 1;        
        n = clearIthBit(n, i);        
        int bitMask = newBit << i;    
        return n | bitMask;           
    }
    
    public static void main(String[] args) {
        System.out.println(updateIthBit(10, 2, 1));
        // 10 = 1010, set bit 2 → 1110 = 14
    }
}
