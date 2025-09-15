package testio;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class TestWriter {
   public static void main(String args[]) {
	   try(FileWriter fw = new FileWriter("java.txt",true);
			   FileReader fr = new FileReader("java.txt");){
		   String data = "java is robust";
		   fw.write(data);
		   data = "";
		   while(true) {
			   int x = fr.read();
			   if(x==-1)
				   break;
			   data = data +(char)x;
		   }
		   System.out.println(data);
		   System.out.println("Operation Success...");
	   }
	   catch(Exception e) {
		   e.printStackTrace();
	   }
   }
}
