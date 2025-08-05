class AddOperation{
   public int add(int x, int y){
      return x + y;
   }
   public int add(int x, int y, int z){
     return x + y + z;
   }
   public int add(int w, int x, int y, int z){
    return w + x + y + z;
   }
}
class TestMain{
    public static void main(String args[]){
       AddOperation obj = new AddOperation();
       int result = obj.add(2,3,4,6);
       System.out.println(result);
    }
}