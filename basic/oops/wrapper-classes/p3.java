// "1 2 3 4 5 6 7 8 9 10"
// "1,2,3,4,5,6,7,8,9,10"
// "Hello 1 world 2 welcome 3"
// You have to add numeric value.

class TestMain{
    public static void main(String args[]){
        String s1 = "120L";
        //float x = Float.parseFloat(s1);
        //double x = Double.parseDouble(s1);
        long x = Long.parseLong(s1);
        System.out.println(x);
    }
}