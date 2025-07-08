/*
  c.E :- incompatible type possible lossy conversion from int to byte
 */
class TestMain{
    public static void main(String args[]){
        byte a,b,c; // -128 to 127
        a = 20;
        b = 10;
        c = (byte)(a + b);
        /*
          c = a + b
          c = 20 + 10
          c = 30 [int]

         */
        System.out.println(c);
    }
}