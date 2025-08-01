import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
       //int x[] = {};
       int arr[][] ={
        {10,20,30}, // 0
        {40,50,60,70,80}, // 1
        {70,80}  //2
       };
       //System.out.println(arr.length);
       for(int r=0; r<arr.length; r++){
         for(int c=0; c<arr[r].length; c++){
            System.out.print(" "+arr[r][c]);
         }
         System.out.println();
       }
    }
}



