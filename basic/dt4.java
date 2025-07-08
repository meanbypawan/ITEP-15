/*
   byte         1-byte      8-bit      2^7 to 2^7-1 [-128 to +127] 
   short        2-byte      16-bit    -2^15 to 2^15-1 [-32768 to 32767]
   int          4-byte      32-bit     -2^31 to 2^31-1[-2147483648 to 2147483647]  
   long         8-byte      64-bit     -2^63 to 2^63-1
 */
class TestMain{
    public static void main(String args[]){
      int x = 2147483647;
      x = x + 3;
      System.out.println(x);
      /* 
       int a = 20, b = 10;
       int c = a + b;
       System.out.println(c);
      */
    }
}