class Addition{
    private int a;
    private int b;
    public void setData(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int getA(){
        return a;
    }
    public void setA(int a){
        this.a = a;
    }
    public void setB(int b){
        this.b = b;
    }
    public int getB(){
        return b;
    }
    public void display(){
        System.out.println("a : "+a+" b : "+b);
    }
}
class TestMain{
    public static void main(String args[]){
        Addition obj = new Addition(); // obj = {a:0,b:0}
        obj.setData(20,10);
        obj.display();
        obj.setA(30);
        obj.display();
    }
}