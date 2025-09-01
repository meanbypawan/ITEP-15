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
        System.out.println("Multiplication : "+obj.operation(20,10));
    }
}