import java.util.*;

class firstClass{
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        


        System.out.println("enter number 1");
        int num1 = sc.nextInt();

        System.out.println("enter number 2");
        int num2 = sc.nextInt();
        System.out.println("enter the operator");
        char operator = sc.next().charAt(0);



        switch(operator){
            case '+' : System.out.println(num1 + num2);
            break;

            case '-': System.out.println(num1 - num2);
            break;

            case '*': System.out.println(num1 * num2);
            break;

            case '%': System.out.println(num1 % num2);
            break;

            case '/': System.out.println(num1 / num2);
            break;

            default:System.out.println("invalid");

        }


    }
}  
