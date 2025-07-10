class TestMain{
    public static void main(String args[]){
        int x=5,y=3,z;
        z = ++x - x-- * y++/++x;
        System.out.println("x : "+x);
        System.out.println("y : "+y);
        System.out.println("z : "+z);
    }
}