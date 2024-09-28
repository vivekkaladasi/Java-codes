 import java.util.*;
 
 public class Arrays{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size= sc.nextInt();
    int numbers[]= new int[size];

    for(int i=0; i<size; i++){
      numbers[i]=sc.nextInt();
    }
    int max = Integer.MIN_VALUE;

    int min = Integer.MAX_VALUE;

    for(int i=0; i<size;i++){
      if(numbers[i]<min){
        min = numbers[i];
      }
      else if(numbers[i]>max){
        max = numbers[i];
      }        
      }
    

    System.out.println("largest number is " + max);
    System.out.println("minimum value is " + min);
    } 

}
 
