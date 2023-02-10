package week1.day2;

public class Fibbinocci {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		int nextNum;
		
		for (int i=1; i<12; i++); {
			System.out.println(num1+" "+num2+" ");
			
			nextNum= num1+num2;
			num1=num2;
			num2=nextNum;
			System.out.println(nextNum+ " ");
		}		
	}

}
