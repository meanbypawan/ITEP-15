/*
  String :-  Immutable [that can not be change]
  StringBuffer :-   Mutable

  Whenever you want frequently change in String data , go for StringBuffer
 */
class TestMain{
    public static void main(String args[]){
       StringBuffer sb1 = new StringBuffer("Hello"); // sb1:- {"hello"}

       sb1.append("World"); // sb1:-{"helloworld"}

       System.out.println(sb1);
    }
}