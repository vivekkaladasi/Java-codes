
import java.util.*;
class firstClass{

   public static void eligibilityCheck(int age){


    if(age>=18){
        System.out.println("eligible");
    }else{
        System.out.println("not eligible");
    }
    

   }

    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         int age= sc.nextInt();
         
         
      eligibilityCheck(age);


        
          
    }
}
