package package1;


//We have to wake up if the dog is barking before 8 or after 22 hours so in that case return true.
//Otherwise, return false;


public class BarkingDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int randomNum  =  (int) ((Math.random() * (50 - 0)) + 0);
		System.out.println(randomNum);
		System.out.println(shouldWakeUp(true, randomNum));
	}

	
	public static boolean shouldWakeUp(boolean barking, int hourOfDay){
	      if(barking == false){
	          return false;
	      }
	      else if((hourOfDay >= 0 && hourOfDay < 8 ) ||( hourOfDay == 23)){
	          return true;
	      }
	      
	      else if(hourOfDay > 8 && hourOfDay < 23){
	          return false;
	      }
	      else {
	          return false;
	      }
	  }
	


}
