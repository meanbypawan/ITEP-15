
class Message{
    private String msg;
    public Message(String msg){
        this.msg = msg;
    }
    public String toString(){
        return msg; // msg.toString()
    }
}
class TestMain{
    public static void main(String args[]){
        String s1 = new String("ABC");
        StringBuffer sb1 = new StringBuffer("PQR");
        StringBuilder sbuild1 = new StringBuilder("XYZ");
        Message obj = new Message("Good Morning..");
        Message obj2 = new Message("Good Evening...");
        System.out.println(s1);
        System.out.println(sb1);
        System.out.println(sbuild1);
        System.out.println(obj);
        System.out.println(obj2);
    }
}