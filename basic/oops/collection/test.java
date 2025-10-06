import java.util.Arrays;
class TestMain{
    public static void main(String args[]){
        int arr1[] = {1,2,3};
        int arr2[] = {1,2,3,4};

        System.out.println(arr1 == arr2);
        System.out.println(arr1.equals(arr2));
        System.out.println(Arrays.equals(arr1,arr2));
    }
}