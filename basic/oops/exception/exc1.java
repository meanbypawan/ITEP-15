import java.util.Scanner;
/*
  Development Mode
  Production Mode
 */
class TestMain{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 1st value");
        int a = sc.nextInt();
        
        System.out.println("Enter 2nd value");
        int b = sc.nextInt();
        try{
         int c = a /b;
         System.out.println("Result : "+c);
        }
        catch(ArithmeticException e){
            System.out.println("Exception Caught...");
            e.printStackTrace();
        }
        System.out.println("At the end.....");
    }
}