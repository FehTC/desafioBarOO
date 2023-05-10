package MOD_4;

import java.util.Locale;
import java.util.Scanner;

import Class_Mod4.Bill;

public class Program_Main_barOO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Bill bill = new Bill();
		
		System.out.print("Sexo: ");
		bill.gender = sc.nextLine().charAt(0);
		
		System.out.print("Quantidade de cervejas:");
		bill.beer = sc.nextInt();
		
		System.out.print("Quantidade de refrigerantes:");
		bill.softDrink = sc.nextInt();
		
		System.out.print("Quantidade de espetinhos: ");
		bill.barbecue = sc.nextInt();
		
		System.out.println("\nRELATÓRIO: ");
		
		System.out.println("Consumo = R$ " + String.format("%.2f",bill.feeding()));
		
		if (bill.cover() == 0 ) {
			System.out.println("Isento de Couvert");
		}
		else {
			System.out.println("Couvert = R$ " + String.format("%.2f",bill.cover()));
		}
		
		System.out.println("Ingresso = R$ " + String.format("%.2f",bill.ticket()));
		
		System.out.println("\nValor a pagar = R$ " + String.format("%.2f",bill.total()));
		
		
		sc.close();
		
	}

}
