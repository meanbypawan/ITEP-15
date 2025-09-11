package testio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class TestWrite {
	public static void main(String[] args) {
		try {
			File f = new File("xyz.txt");
			FileOutputStream fout = new FileOutputStream(f);
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter some text");
			String data = sc.nextLine();
			
			byte b[] =  data.getBytes();
			fout.write(b);
			System.out.println("Operation Success...");
		} catch (FileNotFoundException e) {
           e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
