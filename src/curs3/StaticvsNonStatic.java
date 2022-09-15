package curs3;

public class StaticvsNonStatic {
	
	//Instance area
	public String nume = "jhonny";
	
	
	
	//end of instance areea
	
			
	//static area
	
	public static String prenume = "bravo";
	public static String printeazaMesajStatic () {
		return "hello static" + prenume;
		}
	
	
	
	
	
			
	
	public static void main(String[] args) {
		
   /* StaticVsNonStatic obj = new StaticVsNonStatic ();
    System.out.println (obj.nume);
    System.out.println(obj.printeazaNume());

    		}
    		
	}


}
