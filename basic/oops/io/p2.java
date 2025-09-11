import java.io.File;
class TestMain{
    public static void main(String arg[]){
        File f = new File("/home/pawansahu/Documents/ITEP-15/basic/oops");
        File fileItem[] =  f.listFiles();

        for(File item : fileItem){
            if(item.isDirectory())
             System.out.println(item.getName());
        }
    }
}