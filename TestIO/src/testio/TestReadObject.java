package testio;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestReadObject {
  public static void main(String args[]) {
	  try {
		  FileInputStream fin = new FileInputStream("student.txt");
		  ObjectInputStream ois = new ObjectInputStream(fin);
		  Student s =  (Student)ois.readObject(); // down casting
		  System.out.println(s.getAddress()+" "+s.getId()+" "+s.getName()+" "+s.getContact()+" "+s.getAge());
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
  }
}
