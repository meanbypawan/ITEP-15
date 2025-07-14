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
       int a,b,c,d;
       a = 10;
       b = 20;
       c = 30;
       d = 40;
       boolean x = (a > b) && (++c < d) || (++a<c);
       /*
         x = (a > b) && (++c < d) || (++a<c);
             (10>20)
               false && (++c < d) || (++a<c)
                        false || (++a<c)
                        false || 11 < 30
                        false || true
                             true
        */
       System.out.println(x);
       System.out.println("a : "+a);
       System.out.println("b : "+b);
       System.out.println("c : "+c);
       System.out.println("d : "+d);
    }
}