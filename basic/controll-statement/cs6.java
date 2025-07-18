import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a city name");
        String city = sc.next();

        switch(city){
            case "indore" : System.out.println("MP");break;
            case "pune":System.out.println("MH");break;
            default: System.out.println("Invalid city");
        }
    }
}