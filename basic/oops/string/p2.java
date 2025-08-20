class TestMain{
    public static void main(String args[]){
        String s1 = "Hello";
        String s2 = new String("Hello").intern();

        System.out.println(s1 == s2); // false
    }
}