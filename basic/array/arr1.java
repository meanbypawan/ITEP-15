import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Data size");
        int n = sc.nextInt();

        int arr[] = new int[n]; 
        // arr= 0,1,2,3,4
        //     arr[0], arr[1]------arr[4]
        for(int i=0; i<n; i++){
            System.out.println("Enter "+(i+1)+" element");
            arr[i] = sc.nextInt();
        }

        System.out.println("Given Data..");
        for(int i=0; i<n; i++)
          System.out.println(arr[i]);
        
    }
}

