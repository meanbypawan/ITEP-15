import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number");
       int n = sc.nextInt();
       int i;
       for(i=2; i<=n/2; i++){
         if(n%i == 0)
           break;
       }
       if(i<=n/2 || n < 2){
        System.out.println("Not Prime");
       }
       else 
         System.out.println("Prime");
    }
}