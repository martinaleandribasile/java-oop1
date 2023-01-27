package org.lessons.java.shop;

public class Main {

	public static void main(String[] args) {
		Prodotto bicicletta = new Prodotto("Bicicletta", "Bicicletta rossa e blu", 32.70);
		System.out.println("Codice Prodotto = "+bicicletta.codice);
		bicicletta.printBasePrice(bicicletta.prezzo);
		bicicletta.printivaPrice(bicicletta.prezzo);
		bicicletta.printFullName(bicicletta.codice, bicicletta.nome);
		bicicletta.padCode(bicicletta.codice);
	}

}
