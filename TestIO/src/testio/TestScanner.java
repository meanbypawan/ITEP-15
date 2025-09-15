package testio;

import java.io.File;
import java.util.Scanner;

public class TestScanner {
   public static void main(String args[]) {
	   File f = new File("xyz.txt");
	   try (Scanner sc = new Scanner(f)){
		   while(sc.hasNextLine()) {
			   String line = sc.nextLine();
			   System.out.println(line);
		   }
	   }
	   catch(Exception e) {
		   e.printStackTrace();
	   }
   }
}
