
import java.util.*;
class firstClass{

    public static void  Average ( int a , int b , int c){


        int Answer = (a+b+c) / 3;
        System.out.println(Answer);
         return;
        
          
    }
    
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int b = sc.nextInt();

        int c = sc.nextInt();

        Average(a, b, c);
       
    

    }
}
