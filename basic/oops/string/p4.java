/*
  String :-  Immutable [that can not be change]
  
  StringBuffer :-   Mutable + Thread Safe
                    Slow
  
  StringBuilder :-  Mutable + Don'w want Thread Safety
                    Fast
                    
  Whenever you want frequently change in String data , go for StringBuffer
 */
class TestMain{
    public static void main(String args[]){
        String s1 = new String("ABC");
        String s2 = new String("ABC");

        System.out.println(s1 == s2); // false // location
        System.out.println(s1.equals(s2)); // true // content

        StringBuffer sb1 = new StringBuffer("ABC");
        StringBuffer sb2 = new StringBuffer("ABC");

        System.out.println(sb1 == sb2); // false
        System.out.println(sb1.equals(sb2)); // false
    }
}