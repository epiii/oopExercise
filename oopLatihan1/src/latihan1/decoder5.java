/**
 * 
 */
package latihan1;
import java.util.Scanner;
public class decoder5 {
	public static void main(String[] args) {
		System.out.print("masukkan angka :");
		
		for(int i =0; i<10;i++){
			Scanner scn = new Scanner(System.in);
			char c = scn.next().charAt(0);
			switch (c) {
				case '1':
					System.out.println("D");
					break;
				case '2':
					System.out.println("W");
					break;
				case '3':
					System.out.println("E");
					break;
				case '4':
					System.out.println("L");
					break;
				case '5':
					System.out.println("H");
					break;
				case '6':
					System.out.println("O");
					break;
				case '7':
					System.out.println("R");
					break;
				default:
					System.out.println("input antara angka : 1-7");
					break;
			}
		}
	}
}