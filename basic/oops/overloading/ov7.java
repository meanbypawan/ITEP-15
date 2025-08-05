class TestVarArg{
    public int add(int... x){
        System.out.println(x.getClass().getName());
        int sum = 0;
        for(int i=0; i<x.length; i++){
            sum = sum + x[i];
        }
        return sum;
    }
}
class TestMain{
    public static void main(String args[]){
        TestVarArg obj = new TestVarArg();
        int result = obj.add(20,10,5);
        System.out.println("Addition : "+result);
    }
}