import java.util.*;
public class Arrays{
  public static void main(String argd[]){
    Scanner sc = new Scanner(System.in);

    int rows = sc.nextInt();
    int cols = sc.nextInt();

    int[][] numbers = new int [rows] [cols];


    for(int i=0;i<rows;i++){
      for(int j=0;j<cols;j++){
        numbers[i][j]= sc.nextInt();
      }
    }
    System.out.println();
System.out.println("output matrix of 2D array looks like");
System.out.println();
    for(int i=0;i<rows;i++){
      for(int j=0; j<cols;j++){
        System.out.print(numbers[i][j] + " ");
      }
      System.out.println();
    }

  }
}
