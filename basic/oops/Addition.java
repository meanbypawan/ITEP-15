class Addition{
   private int a;
   private int b;
   public void add(){
      System.out.println("Result : "+(a+b));
   }
   public void setData(int x, int y){
      a = x;
      b = y;
   }
}
class TestMain{
    public static void main(String args[]){
       Addition obj = new Addition(); // obj = {a:0, b:0,add()}
       obj.Addition(20,10);
       obj.add();
    }
}