/*
  Controll-Statement/Conditional Statement

  state----1;
  state----2;
  n>10
   state----3;
  state----4;
  --------------------------
  if
  if-else
  nested-if-else
  switch
  loop
   |---do-while
   |---while
   |---for
  ----------------------------
  syntax :-
   1. if(condition/boolean_expression)
        statement----1;
   2. if(condition/BE){
        statement---1;
        statement---2;
      }
   3. if(condition/BE)
         statement---1;
      else
         statement----2;
   
   4. if(condition/BE){
   
      }
      else{
      
      }

 WAP to enter an integer and check it even or odd.
 */
import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter an integer number");
      int n = sc.nextInt();
      // 21
      if(n%2 != 0)
        System.out.println("ODD");
      else
        System.out.println("EVEN");   
    }
}







