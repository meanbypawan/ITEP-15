package testio;

public class InfoBeans {
   
	private InfoBeans() {}
    
	private static InfoBeans ref = null;
	
	public static InfoBeans getInfoBeans() {
		if(ref == null)
			ref = new InfoBeans();
		return ref;
	}
	public static void main(String arggs[]) {
		  InfoBeans obj1  =	InfoBeans.getInfoBeans();
		  InfoBeans obj2  =	InfoBeans.getInfoBeans();
		
		  System.out.println(obj1);
		  System.out.println(obj2);
	}
}
