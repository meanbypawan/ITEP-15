// What to do not How to do
abstract class Vehicle{
    public void fuleType(){
        System.out.println("Vehicle using petrol...");
    }
    abstract public void puc();
    abstract public void insurance();
    abstract public void breakSystem();
}
class TVS extends Vehicle{
   public void puc(){
     System.out.println("PUC Available At : 500 Rs");
   }   
   public void insurance(){
     System.out.println("Insurace b/w 1000 to 1500");
   }
   public void breakSystem(){
    System.out.println("Disk Brak In Rear");
   }
}
class TATA extends Vehicle{
    public void puc(){
        System.out.println("PUC Available At : 1000 Rs");
    }
    public void insurance(){
        System.out.println("Between 5000 to 10000");
    }
    public void breakSystem(){
        System.out.println("Drum in all Wheels");
    }
}
class TestMain{
    public static void main(String args[]){
       Vehicle v = null;

       //v = new TVS();
       //v = new TATA();
       
       v.breakSystem();

    }
}