import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter data size");
       int n = sc.nextInt();
       int arr[] = new int[n+1];
       
       System.out.println("Enter "+n+" element");
       for(int i=0; i<n; i++)
         arr[i] = sc.nextInt();

       System.out.println("Enter position");
       int position = sc.nextInt();

       System.out.println("Enter element");
       int element = sc.nextInt();
       if(position > (n+1) || position < 1){
          System.out.println("Invalid position");
       }
       else{
          int i;
          
          for(i=n-1; i>=position-1; i--)
            arr[i+1] = arr[i];

          arr[position-1] = element;
          n = n + 1;

          System.out.println("After insert");
          for(int j=0; j<n; j++)
            System.out.println(arr[j]);
       }
    }
}