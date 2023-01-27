package org.lessons.java.shop;


import java.util.Random;

public class Prodotto {
	int codice;
	String nome;
	String descrizione;
	double prezzo;
	double iva=22;
	public Prodotto( String nome, String descrizione, double prezzo) {
		super();
		Random r= new Random();
		this.codice = r.nextInt(99999999 + 1 - 1) + 1;
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
	}
	public String getFullName() {
		String fullName= this.codice + this.nome;
		return fullName;
	}
	
	public double getIvaPrice( ) {
		double ivaPrice = this.prezzo + (this.prezzo * iva / 100);
		return ivaPrice;
	}
	public int getCodice() {
		return this.codice;
	}
	public double getPrice() {
		return this.prezzo;
	}
	
	public int getPadCode() {
		String stringCode = String.format("%08d",this.codice);
		return this.codice= Integer.parseInt(stringCode);
	}
	
	
	
	
}
