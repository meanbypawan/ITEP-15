import java.util.ArrayList;
class TestMain{
    public static void main(String args[]){
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(30);
        al.add(40);
        for(Integer element : al){
            System.out.println(element);
        }
        //System.out.println(al);
        /*
        for(int i=0; i<al.size(); i++){
            System.out.println(al.get(i));
        }
        */
    }
}