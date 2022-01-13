
public class Swap_numbers {
	public static void main(String[] args){
		int swap1, swap2, temp=0;
		swap1=10;
		swap2=20;
		System.out.println("Before swaping number 1 is : "+ swap1);
		System.out.println("Before swaping number 2 is : "+ swap2);
		temp=swap1;
		swap1=swap2;
		swap2=temp;
		System.out.println("After swaping number 1 is : "+ swap1);
		System.out.println("After swaping number 2 is : "+ swap2);
	}
}
