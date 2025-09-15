package testio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestWriteObject {
   public static void main(String args[]) {
	   try {
		   FileOutputStream fout = new FileOutputStream("student.txt");
	       Student s = new Student();
	       s.setId(10001);
	       s.setName("Ankita");
	       s.setContact("9009111222");
	       s.setAge(28);
	       s.setAddress("Indore, Rajmohalla");
	       ObjectOutputStream oos = new ObjectOutputStream(fout);
	       oos.writeObject(s);
	       System.out.println("Operation Success....");
	   }
	   catch(Exception e) {
		   e.printStackTrace();
	   }
   }
}
