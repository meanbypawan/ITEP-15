class Operation{
   public int sumOfArray(int arr[]){
     int sum = 0;
     for(int element : arr)
       sum = sum + element;
     return sum;  
   }
}

class TestMain{
    public static void main(String args[]){
       Operation obj = new Operation();
       int arr[] = {1,3,5,6,2,4};
       int result =  obj.sumOfArray(arr);
       System.out.println("Sum  : "+result);
    }
}