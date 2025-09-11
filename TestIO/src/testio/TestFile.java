package testio;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class TestFile {
    public static void main(String args[]) {
    	File f = new File("xyz.txt");
    	if(f.exists()) {
    		System.out.println("File Found..");
    	    System.out.println("Name : "+f.getName());
    	    System.out.println("Absoulte path : "+f.getAbsolutePath());
    	    
    	    long timestamp =  f.lastModified();
    	    SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy hh:mm");
    	    String date =  sd.format(new Date(timestamp));
    	    System.out.println("Last Modified Date : "+date);
    	}
    	else {
    		System.out.println("File not found...");
    		try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    }
}
