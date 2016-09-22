package latihan1;
import java.util.Scanner;

public class _1operator2 {
	public static void main(String[]args){
		boolean flag=true;
		
		while(flag){
			float a,b,res=0; 
			int s;
			String k;
			
	//input bilangan 1
			System.out.println("-------");
			System.out.print("input bilangan 1 :");
			Scanner x = new Scanner(System.in);
			a=x.nextFloat();
	
	//input bilangan 2
			System.out.print("input bilangan 2 :");
			b=x.nextFloat();
			
	//operator
			System.out.println("Pilihan operator :");
			System.out.println("1. kali x");
			System.out.println("2. tambah +");
			System.out.println("3. bagi /");
			System.out.println("4. sisa bagi %");
			System.out.println("5. kurang -");
			
			System.out.print("Pilih salah satu operator : ");
			s=x.nextInt();
	
			switch(s){
				case 1: 
					res=a*b;
				break;
				case 2: 
					res=a+b;
				break;
				case 3: 
					res=a/b;
				break;
				case 4: 
					res=a%b;
				break;
				case 5: 
					res=a-b;
				break;
				default:
					res=a+b;
				break;
			}
		//output
			System.out.println("hasil :"+res);
			System.out.println("=================");
		//konfirmasi lanjut/keluar ?
			System.out.print("Keluar ? (y/n)");
			k=x.next();
			
			if(k=="y"){
				flag=false;
//				System.exit(0);
				break;
			}
			System.out.println();
		}
	}
}
