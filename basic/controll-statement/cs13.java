import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number");
       int n = sc.nextInt();
       boolean status = false;
       for(int i=2; i<=n/2; i++){
         if(n%i == 0){
           status = true;
           break;
         }
       }
       if(status || n < 2)
         System.out.println("Not Prime");
       else
         System.out.println("Prime");  
    }
}