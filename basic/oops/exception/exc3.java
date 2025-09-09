import java.util.Scanner;
import java.util.InputMismatchException;
class TestMain{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        try{
          System.out.println("Enter 1st value");
          int a = sc.nextInt();
        
          System.out.println("Enter 2nd value");
          int b = sc.nextInt();
        
          int c = a / b;
          System.out.println("Result : "+c);
        }
        catch(ArithmeticException | InputMismatchException e){
          String exClass = e.getClass().getName();
          if(exClass.equals("java.lang.ArithmeticException"))
            System.out.println("Denominator can't be zero.");
          else if(exClass.equals("java.util.InputMismatchException"))
            System.out.println("Only integers are allowed..");  
        }
        System.out.println("At the end.....");
    }
}