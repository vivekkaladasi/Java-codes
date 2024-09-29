
import java.util.*;
public class strings {
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);

       String firstname = sc.nextLine();

       String Lastname = sc.nextLine();

       String fullname = firstname + " " +Lastname;

       System.out.println("the given full name is => " + fullname);

       System.out.println("lenght of full name is " +fullname.length());

       //charAt

       for(int i=0;i<fullname.length();i++){
        System.out.println(fullname.charAt(i));
       }


        //compare
        System.out.println("compare function below");

        if(firstname.compareTo(Lastname)==0){
            System.out.println("string are equal");
        }else if(firstname.compareTo(Lastname)>=1){
            System.out.println("first name is greater");
        }
        else{
            System.out.println("last name is greater");
        }

        
        //




       }
    }

