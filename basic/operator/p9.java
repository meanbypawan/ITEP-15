/*
  Logical Operation :-
   1. && AND
   2. || OR
   
   A        B         A&&B           A||B
  (a>b)    (c<d)    (a>b)&&(c<d)   (a>b)||(c<d)
   T        F          F             T
   F        T          F             T
   T        T          T             T
   F        F          F             F

 */
class TestMain{
    public static void main(String arg[]){
      System.out.println(100&&200); // error 
    }
}