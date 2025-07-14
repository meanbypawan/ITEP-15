import java.util.Scanner;
class Addition{
    public static void main(String args[]){
        
        System.out.println("Enter first integer value");
        int a = new Scanner(System.in).nextInt();
    
        System.out.println("Enter second integer value");
        int b = new Scanner(System.in).nextInt();
    
        int result = a + b;
        System.out.println("Addition : "+result);
    }
}