interface I{
    int calc(int a);
}

class TestMain{
    public static void main(String ag[]){
        I obj1 = a->a*a;

        int result = obj1.calc(20);
        System.out.println("Result : "+result);
    }
}