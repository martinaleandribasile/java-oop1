package org.lessons.java.shop;
import java.text.DecimalFormat;

public class Main {
	private static final DecimalFormat round = new DecimalFormat("0.00");
	public static void main(String[] args) {
		
		Prodotto bicicletta = new Prodotto("Bicicletta", "Bicicletta rossa e blu", 32.70);
		System.out.println("Codice Prodotto = "+bicicletta.codice);
		double prezzoProdotto= bicicletta.price();
		System.out.println("Il prezzo del prodotto e': " + prezzoProdotto + " euro");
		double prezzoIva= bicicletta.ivaPrice();
		System.out.println("Il prezzo del prodotto con iva e': " + round.format(prezzoIva) + " euro");
		String fullName=bicicletta.printFullName();
		System.out.println("Il nome completo del prodotto e': " + fullName );
		int codicePad = bicicletta.padCode();
		System.out.println("Il codice con pad e': " + codicePad );
	}

}
