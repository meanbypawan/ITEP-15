/*
  Operator :- It is symbol which perform the operation on operand(data).
  Unary :-
  Binary
  Ternery
  -----------------------------
  1. Arithmetic operator (+,-,*,/,%)
  2. Relational operator (>,<,>=,<=,==,!=)
  3. logical operator (&&(AND), ||(OR), !(NOT))
  4. Assignment (=)
  5. Increment/Decrement (++, --)
  6. Bitwise operator (&, |, ^, <<, >>, >>>, ~)
  7. Shorthand operator (+=, -=, *=, /=)
  8. Conditional operator ( ? : )
  9. instanceOf
 */
class TestMain{
    public static void main(String args[]){
       System.out.println("7/2 : "+(7/2));
       System.out.println("7%2 : "+(7%2));
       System.out.println("-7%2 : "+(-7%2)); // -1
       System.out.println("7%-2 : "+(7%-2)); // 1
       System.out.println("-7%-2 :"+(-7%-2)); // -1
       System.out.println("7.5%2 : "+(7.5%2)); // .5
       System.out.println("2%7 : "+(2%7)); // 2
       //System.out.println("7/0 : "+(7/0)); // ArithmeticException
       System.out.println("7.5/0 : "+(7.5/0));
       System.out.println("-7.5/0 : "+(-7.5/0));
       System.out.println("7.5%0 "+(7.5%0));
       //System.out.println("7%0 : "+(7%0));
       System.out.println("0%7 : "+(0%7));
    }
}       











