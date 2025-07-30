class TestMain{
    public static void main(String args[]){
        int arr[] = {2,3,3,2,4,5,5,6,6,6};
        boolean flag[] = new boolean[arr.length];

        for(int i=0; i<arr.length; i++){
            int count = 1;
            if(flag[i])
              continue;
            for(int j=i+1; j<arr.length; j++){
               if(arr[i] == arr[j]){
                count++;
                flag[j] = true;
               }
            }  
            System.out.println("Element "+arr[i]+" Found "+count+" times");
        }
    }
}