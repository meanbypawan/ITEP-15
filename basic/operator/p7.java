class TestMain{
    public static void main(String args[]){
      int x=5;

      boolean y = x++ > 5;
      /*
        
        y  = x > 5
        x = x + 1;
       */
      System.out.println("x : "+x+" y : "+y);
    }
}