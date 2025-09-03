interface I{
    void operation(int a, int b);
    default void m1(){
        System.out.println("m1-executed...");
    }
}

class TestMain{
    public static void main(String args[]){
        I obj1 = (a,b)->System.out.println("Addition : "+(a+b));
        I obj2 = (a,b)->System.out.println("Subtraction : "+(a-b));
        I obj3 = (a,b)->System.out.println("Multiplication : "+(a*b));
        I obj4 = (a,b)->{
            if(a>b)
              System.out.println("Greater : "+a);
            else
              System.out.println("Greater : "+b);  
        };
        obj1.operation(20,10);
        obj1.m1();
        obj2.operation(20,10);
        obj3.operation(20,10);
        obj4.operation(50,100);
    }
}