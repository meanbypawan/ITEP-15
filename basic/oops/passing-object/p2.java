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
    public void add(Distance d1, Distance d2){
        this.km = d1.km + d2.km;
        this.meter = d1.meter + d2.meter;
        if(this.meter >=1000){
            this.km++;
            this.meter %= 1000;
        }
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
        Distance d3 = new Distance();
        d3.add(d1,d2);
        System.out.println("Total Distance");
        d3.display();
    }
}