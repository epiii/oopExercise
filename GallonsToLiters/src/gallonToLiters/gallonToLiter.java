package gallonToLiters;

import java.util.Scanner;

public class gallonToLiter {
	//	main : fungsi yang pertama kali dijalankan (otomatis)
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("input jumlah gallon :");
		
		//floating point (desimal): double,float
		double gallons,liters=0;
//		boolean
		try {
			gallons = sc.nextDouble();
			double liters = gallons * 3.785;
		}catch(inputMismatchException e){
			System.out.println("salah tipe data gan :(");
		}
		System.out.println("Liters ="+liters);
	}
}
