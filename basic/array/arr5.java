import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
        int arr[] = {10,20,30,40,50,60,70,80,90};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element to be search");
        int element = sc.nextInt();
        int i;
        boolean status = false;
        for(i=0; i<arr.length;i++){
            if(arr[i] == element){
              status = true;
              break;
            }  
        }
        if(status)
         System.out.println("Element Found");
        else
         System.out.println("Element Not Found");        
    }
}