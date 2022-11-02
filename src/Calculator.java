import java.util.Scanner;

public class Calculator {

	public static void main(String args[]) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in) ;
		
		System.out.print("กรอกตัวเลขที่  1 : ");
		int n1 = sc.nextInt();
		
		System.out.print("กรอกตัวเลขที่  2 : ");
		int n2 = sc.nextInt();
		
		System.out.print("กรอกตัวเลขที่  3 : ");
		int n3 = sc.nextInt();
		
		int multiplyNumber = n1 + n2 + n3;
		System.out.println("multiplyNumber = "+ n1+" + "+n2+" + "+n3+" = "+multiplyNumber);
		
		int price = 1000;
		double calVat7 = (price/100)*7 ;
		System.out.println("Vat = "+calVat7);
		
		double calTotalPrice = price + calVat7;
		System.out.println("TotalPrice = " +calTotalPrice);
		
	}

}