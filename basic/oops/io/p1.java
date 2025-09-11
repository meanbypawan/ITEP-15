import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;
/*
  isYYY()
  canYYY()
  hasYYY()------> boolean
 */
class TestMain{
    public static void main(String arg[]){
       try{ 
        File f = new File("xyz.txt");
        if(f.exists()){
          System.out.println("File found..");
          System.out.println("Name : "+f.getName());
          System.out.println("Path : "+f.getAbsolutePath());
          System.out.println("Data Size : "+f.length());
          System.out.println("canRead : "+f.canRead());
          System.out.println("canWrite : "+f.canWrite());
          System.out.println("canExecute : "+f.canExecute());
          System.out.println("isFile : "+f.isFile());
          System.out.println("isDirectory : "+f.isDirectory());
          System.out.println("isHidden : "+f.isHidden());
        //   long timestamp =  f.lastModified();
        //   Date d = new Date(timestamp);
        //   SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy hh:mm");
        //   String formattedDate = sd.format(d);
          String formattedDate = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").format(new Date(f.lastModified()));
          System.out.println("lastModified : "+formattedDate);
        }
        else{
            System.out.println("File not found...");
            f.createNewFile();
        }
       }
       catch(IOException e){
         e.printStackTrace();
       } 

    }
}