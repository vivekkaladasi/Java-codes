
import java.util.*;
class firstClass{

    public static void sumOfOdd(int n){

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            // Check if the number is odd
            if (i % 2 != 0) {
                sum += i;
        

            }
        }
        System.out.print(sum);
    }

    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         int n = sc.nextInt();
         
        sumOfOdd(n);


        
          
    }
}
