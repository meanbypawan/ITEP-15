// Lambda Expression
interface I1{
    int operation(int x,int y);
}
class TestMain{
    public static void main(String args[]){
        I1 obj = new I1(){
            public int operation(int x, int y){
                return x * y;
            }
        };
        I1 obj2 = new I1(){
            public int operation(int x, int y){
                return x > y ? x : y;
            }
        };
        I1 obj3 = new I1(){
            public int operation(int x, int y){
                return x + y;
            }
        };
        System.out.println("Multiplication : "+obj.operation(20,10));
        System.out.println("Greater value : "+obj2.operation(20,10));
        System.out.println("Addition : "+obj3.operation(20,10));
    }
}