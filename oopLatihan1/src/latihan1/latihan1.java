package latihan1;
import java.util.Scanner;

public class latihan1 {
	public static void main(String[]args){
		System.out.println("akan masuk loop ");
		int nLoop=5;
//		boolean cek=true;

		Scanner sc = new Scanner(System.in);
		int i=0;
		int tot=0;
		while(i<nLoop){
			i++;
			System.out.println("input sembarang : ");
			int x=sc.nextInt();
			tot+=x;
		}
		System.out.println("total = "+tot);
	}
}
