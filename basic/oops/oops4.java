class Operation{
   public void updateArray(int arr[]){
      for(int i=0; i<arr.length; i++)
        arr[i] = arr[i] + 10;
   }
}

class TestMain{
    public static void main(String args[]){
       Operation obj = new Operation();
       int x[] = {1,2,3,4,5};

       obj.updateArray(x);
       
       for(int element : x)
         System.out.println(element);
    }
}