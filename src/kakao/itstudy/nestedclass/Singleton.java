package kakao.itstudy.nestedclass;

public class Singleton {
   static Object singleton = null;

	private Singleton(){}
	
	public static Singleton sharedInstance() {
    	
		
		if(singleton == null) {
    		 singleton = new Singleton();
    	 }
		return (Singleton) singleton;
	}
    
}
