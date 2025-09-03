interface Greetings{
    void wish();
}

class TestMain{
    public static void main(String ars[]){
       Greetings obj1 =  ()->System.out.println("GM...");
       Greetings obj2 = ()->System.out.println("GN....");
       Greetings obj3 = ()->System.out.println("GE....");
       obj1.wish();
       obj2.wish();
       obj3.wish();
    }
}