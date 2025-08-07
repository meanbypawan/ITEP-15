class Distance{
    private int km;
    private int meter;
    public Distance(int km, int meter){
        this.km = km;
        this.meter = meter;
    }
    
    public Distance(){}

    public Distance add(Distance d){
        Distance temp = new Distance();
        temp.km = this.km + d.km;
        temp.meter = this.meter + d.meter;
        if(temp.meter >=1000){
            temp.km++;
            temp.meter %= 1000; // temp.meter = temp.meter%1000
        }
        return temp;
    }
    public void display(){
        System.out.println(km+" km "+meter+" meter");
    }
}
class TestMain{
    public static void main(String args[]){
        Distance d1 = new Distance(5,700);
        Distance d2 = new Distance(2,600);
        d1.display();
        d2.display();
        Distance result =  d1.add(d2);
        result.display();
    }
}