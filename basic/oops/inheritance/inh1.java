class J5{
    public void receivingCall(){
        System.out.println("Call Received...");
    }
    public void rejectingCall(){
        System.out.println("Call Rejected...");
    }
}
class J7 extends J5{
    public void camera(){
        System.out.println("Photo Clicked..");
    }
}

class TestMain{
    public static void main(String args[]){
        J7 j7 = new J7();
        j7.receivingCall();
        j7.rejectingCall();
        j7.camera();
    }
}