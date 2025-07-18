import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter 1st value");
      int a = sc.nextInt();
      System.out.println("Enter 2nd value");
      int b = sc.nextInt();

      System.out.println("Before Swapping a : "+a+"  b : "+b);
      a = a ^ b;
      b = a ^ b;
      a = a ^ b;
      System.out.println("After Swapping a : "+a+" b : "+b);
    }
}