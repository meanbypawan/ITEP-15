import java.util.Scanner;
/*
  DRY :- Donot Repeat Your self.
  KISS :-  Keep It Simple And Short
 */
class TestMain{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Press + for addition");
       System.out.println("Press - for subtraction");
       System.out.println("Press * from multiplication");
       System.out.println("Press / for division");
       System.out.println("Enter your choice");
       char choice = sc.next().charAt(0);
       int a=0,b=0;
       if(choice == '+' || choice == '-' || choice == '*' || choice == '/'){
        System.out.println("Enter 2 number");
        a = sc.nextInt();
        b = sc.nextInt();
       }            
       switch(choice){
        case '+' : System.out.println("Addition : "+(a+b));
                   break; 
        case '-' : System.out.println("Subtraction : "+(a-b));
                   break; 
                    
        case '/' : System.out.println("Division : "+(a/b));
                   break; 
        case '*' : System.out.println("Multiplication : "+(a*b));
                   break; 
        default : System.out.println("Invalid choice | please try again");
       }
    }
}