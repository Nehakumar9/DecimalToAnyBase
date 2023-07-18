package decimaltoanybase;

import java.util.Scanner;

public class DecimalToAnyBase {
		
		public static String decimalToAnyBase(int number,int index)
		{
			String result="";
			while(number > 0)
			{
				result += number%index;
				number = number/index;
			}
			return result;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scanner = new Scanner(System.in);
			int number = scanner.nextInt();
			int index = scanner.nextInt();
			String result = decimalToAnyBase(number,index);
			System.out.println(result);
			

		}
}
