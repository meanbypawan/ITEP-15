/*
    class test{
      String msg;
      public Test(String msg){}
      public String set_msg(String msg){}

    }
 */
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
        catch(Exception e){
          System.out.println(e.getClass().getName()+" caught..");
        }
        finally{
            System.out.println("Finally Executed....");
            sc.close();
        }
        System.out.println("At the end.....");
    }
}