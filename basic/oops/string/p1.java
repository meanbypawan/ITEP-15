import java.util.Scanner;
import java.util.LinkedHashSet;
class Sequence{
    private String data;
    public Sequence(String data){
        this.data = data;
    }
    public int getLength(){
       int count = 0;
       char arr[] = data.toCharArray();
       for(char element : arr)
         count++;
       return count;  
    }
    public String getUpperCase(){
       String result = ""; 
       char arr[] =  data.toCharArray();
       for(char element : arr){
          if(element >='a' && element <='z')
            element = (char)(element - 32);

          result  = result + element;  
       }
       return result;
    }
    public String getTrim(){
       char arr[] = data.toCharArray();
       for(int i=0; i<arr.length-1; i++){
         if(arr[i]==' ' && arr[i+1]==' '){
            arr[i] = '\0';
         }
       }
       String s = new String(arr);
       arr = s.toCharArray();
       if(arr[0] == ' ')
         arr[0] = '\0';

       if(arr[arr.length-1]==' ')
         arr[arr.length-1] = '\0';  
       return new String(arr);
    }
    public String getTrimTwo(){
        char arr[] = data.toCharArray();
        for(int i=0,j=arr.length-1; true ; ){
           if(arr[i]!=' ' && arr[j]!= ' ')
             break;
           if(arr[i]==' ')
             arr[i++] = '\0';

           if(arr[j]== ' ')
             arr[j--] = '\0';
        }
        return new String(arr);
    }

    public boolean isPalindrome(){
       int i=0;
       int j = data.length()-1;
       while(i<j){
         if(data.charAt(i) != data.charAt(j))
           return false;
         i++;
         j--;  
       }
       return true;
    }
    public LinkedHashSet<String> getAllPalindrome(){
       LinkedHashSet<String> al = new LinkedHashSet<String>();
       for(int i=0; i<data.length()-1; i++){
         for(int j=i+1; j<data.length(); j++){
             String s = "";
             for(int k=i; k<=j; k++)
               s = s + data.charAt(k);
             Sequence seq = new Sequence(s);
             boolean status = seq.isPalindrome();
             if(status)
               al.add(s);
         }
       }
       return al;
    }
}
class Test{
    public static void main(String args[]){
      Sequence s = new Sequence("aaabbbacccababacccaabb");
      LinkedHashSet<String> al =  s.getAllPalindrome();
      for(String element : al)
        System.out.println(element);
      /*
      System.out.println("Enter String");
      String data = sc.next();  
      Sequence s1 = new Sequence(data);
      String result = s1.getUpperCase();
      System.out.println(result);
      */
    }
}
