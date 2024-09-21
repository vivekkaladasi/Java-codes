
import java.util.*;
class firstClass{

    public static int Multiply ( int a , int b){

        return a*b;
        
        
    }
    
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
 
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("product of a and b is -> " + Multiply(a, b));

       
    

    }
}
