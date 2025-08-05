class Test{
    public int add(int... x){
        int sum = 0;
        for(int element : x)
          sum = sum + element;
        return sum;
    }
}
class TestMain{
    public static void main(String args[]){
        Test obj = new Test();
        System.out.println(obj.add(20,10));
        System.out.println(obj.add(20,10,5));
        System.out.println(obj.add(20,10,5,3));

    }
}