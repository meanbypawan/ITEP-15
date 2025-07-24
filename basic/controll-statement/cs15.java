// 1	11	111	  1111	 11111...n
import java.util.Scanner;
class TestMain{
    public static void main(String arg[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter n");
      int n = sc.nextInt();
      int sum = 0;
      for(int i=0; n!=0; n--){
        i = i * 10 + 1;
        sum += i; //sum = sum + i;
        System.out.print(i+"\t");
      }
      System.out.println("Sum : "+sum);
      System.out.println();
    }

}