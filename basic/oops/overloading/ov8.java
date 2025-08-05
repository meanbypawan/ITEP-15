class TestVarArg{
    public int add(String y, String z, int... x){
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
        int result = obj.add("A","B",5,4,5,6);
        System.out.println("Addition : "+result);
    }
}