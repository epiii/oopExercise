package latihan1;
import java.util.Scanner;

public class _1operator {
	public static void main(String[]args){
		float a,b,res=0; 
//		int s;
		String s;
		
//input bilangan 1
		System.out.println("input bilangan 1 :");
		Scanner x = new Scanner(System.in);
		a=x.nextFloat();

//input bilangan 2
		System.out.println("input bilangan 2 :");
		b=x.nextFloat();
		
//operator
		System.out.println("Pilihan operator ;\n");
		System.out.println("1. '*' kali ");
		System.out.println("2. '+' tambah");
		System.out.println("3. '/' bagi");
		System.out.println("4. '%' sisa bagi");
		System.out.println("5. '-' kurang");
		
		System.out.println("input salah satu operator : ");
		s=x.nextLine();

		switch(s){
			case '*': 
				res=a*b;
			break;
			case '-': 
				res=a+b;
			break;
//			case 3: 
//				res=a/b;
//			break;
//			case 4: 
//				res=a%b;
//			break;
//			case 5: 
//				res=a-b;
//			break;
		}
//output
		System.out.println("tampil :"+res);
	}
}
