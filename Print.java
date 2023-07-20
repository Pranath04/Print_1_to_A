package print_1toA;

import java.util.Scanner;

public class Print{
	public static void printintegers(int A) {
		if(A==0) {
			return;
		}
		
		printintegers(A-1);
		System.out.print(A+" ");
		
	}
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		scanner.close();
		printintegers(A);
		System.out.println();
	}
}