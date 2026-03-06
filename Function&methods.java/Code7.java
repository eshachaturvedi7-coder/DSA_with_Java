 //FUNCTION OVERLOADING
 //USING PARAMETERS
 // Calculator--:
 public class Code7{
    //fun to calcuate sum of 2 no.
    public static int sum(int a, int b){
        return a + b;

    } 

    // fun to calculate sum of 3 no.
     public static int sum(int a, int b, int c){
        return a+b+c;
     } 
     public static void main(String[] args) {
         System.out.print(sum(3,5));
         System.out.print(sum(5,2,1));
     }
 }