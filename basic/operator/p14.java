import java.util.Scanner;
class Addition{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first integer value");
        int a = sc.nextInt();
    
        System.out.println("Enter second integer value");
        int b = sc.nextInt();
    
        int result = a + b;
        System.out.println("Addition : "+result);
    }
}