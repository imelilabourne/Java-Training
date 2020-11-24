package package1;

public class Exercise2 {

	public static void main(String[] args) {
		printConversion(7);
	}
	
	
	public static long toMilesPerHour(double kilometersPerHour){

	    
	    if(kilometersPerHour < 0){
	        return -1;
	    }
	    
	    else{
	        long temp = Math.round(kilometersPerHour );
	        return temp;
	    }
	}

	public static void printConversion(double kilometersPerHour){
	    
	   if(kilometersPerHour < 0){
	       System.out.println("Invalid Value");
	       
	   }
	   else{
		   
		    long miles = toMilesPerHour(kilometersPerHour * 0.62137);
		    System.out.println(kilometersPerHour + " km/h = " + miles + " mi/h");
	   
	   }
	}

}
