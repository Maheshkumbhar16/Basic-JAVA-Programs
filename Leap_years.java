package examples;

public class Leap_years {
	public static void main(String main[]) {
		int num1=2000,num2=2010;
	    boolean year_condition=false;
	    for(int i=num1; i<=num2; i++){
	        if(i%4==0){
	            year_condition=true;
	            System.out.println(i + " is leap year");
	        }
	    }
	    if (year_condition==false){
	    	System.out.println("No leap year found");
	    }
	}
}
