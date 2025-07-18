/*
   n = 5

   5 X 1 = 5
   5 x 2 = 10
   ;
   ;
   5 x 9 = 45
   5 x 10 = 50
 */
import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number");
      int n = sc.nextInt();
      int i=1;
      while(i<=10){
        System.out.println(n+" X "+i+" = "+(n*i));
        i++;
      }
    }
}




