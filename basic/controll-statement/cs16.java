// A ---> a
// 65---> 97
// 65 + 32 = 97
class TestMain{
    public static void main(String args[]){
        for(char ch = 'A'; ch<='Z';){
          System.out.println(ch);
          ch = (char)(ch + 1);
        }  
    }
}