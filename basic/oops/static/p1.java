/*
   Class Member :-
     1. Intance Member :- Belongs To Object
     
     2. Static Member  :- Belongs To Class
         a. Data member
         b. method
 
   Instance & Static Data Member :-
     Data :- 
       Instance Data :- Seperate corresponding to each object
       Stateic Data member :- Common/Sharing for all object
 */
class Test{
   private int a=20; // Intance
   private static int b=10; // Static
   public void increment(){
      ++a;
      ++b;
   }
   public static void display(){
     System.out.println(a);
     System.out.println(b);
   }
}




