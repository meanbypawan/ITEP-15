// Valid switch expression value :- byte,short,int,char,string
class TestMain{
    public static void main(String args[]){
        char x='a';
        switch(x){
            case 1: System.out.println("Matched...");break;
            case 97:System.out.println("Character Matched");break;
            default: System.out.println("Not Matched...");
        }
    }
}