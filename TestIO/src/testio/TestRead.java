package testio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestRead {
  public static void main(String[] args) {
     try {
    	 FileInputStream fin = new FileInputStream("xyz.txt");
    	 String data = "";
    	 while(true) {
    		int x =  fin.read();
    		if(x == -1)
    			break;
    	    data = data + (char)x;
    	 }
    	 System.out.println(data);
     }
     catch(IOException e) {
    	 e.printStackTrace();
     }
  }
}
