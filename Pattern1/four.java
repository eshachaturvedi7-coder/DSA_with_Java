public class four {
    public static void main(String[] args) {

        int n = 4;   // size of square

        for (int line = 1; line <= n; line++) {   
            for (int star = 1; star <= n; star++) {  
                System.out.print("* ");
            }
            System.out.println();   
        }
    }
}