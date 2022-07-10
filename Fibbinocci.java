package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {

		// 0 1 1 2 3 5 8 13 21 34 55
//		Add first and second number assign to sum
//		Assign second number to the first number
//		Assign sum to the second number
//		Print sum

		int firstNum = 0;
		int secNum = 1;
		int sum = 0;

		for (int i = 0; i < 11; i++) {			

			sum = firstNum + secNum;
			firstNum=secNum;
			secNum=sum;
			
			System.out.println(sum);
		}
		

	}

}
