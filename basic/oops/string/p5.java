class TestMain{
    public static void main(String args[]){
        String s1 = "hello";
        StringBuffer sb1 = new StringBuffer(s1);
        sb1 = sb1.reverse();
        //System.out.println(sb1);
        s1 = sb1.toString();
        System.out.println(s1);
    }
}