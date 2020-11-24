package package1;

public class MegaBytesConverter {

	public static void main(String[] args) {
		printMegaBytesAndKiloBytes(5000);

	}
	
	public static void printMegaBytesAndKiloBytes(int kiloBytes){
	    int MB = kiloBytes / 1024;
	    int remainder = kiloBytes % 1024;
	      
	    if(kiloBytes < 0){
	          System.out.println("Invalid Value");
	    }
	    
	    else{
	        System.out.println(kiloBytes + " KB = "+ MB + " MB and " + remainder + " KB");
	    }
	      
	}

}
