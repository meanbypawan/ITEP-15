import java.util.Scanner;
class VoterException extends Exception{
    public VoterException(String msg){
        super(msg);
    }
    public VoterException(){
        super("You are less then 18 | Can't vote");
    }
}
class TestMain{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Age");
       int age = sc.nextInt();
       try{
         if(age < 18)
           throw new VoterException("Abi aap chote hai.");
         else{
           System.out.println("You can vote..");
         }
       }
       catch(VoterException e){
        e.printStackTrace();
       } 

    }
}