package org.lessons.java.shop;

import java.text.DecimalFormat;
import java.util.Random;

public class Prodotto {
	private static final DecimalFormat round = new DecimalFormat("0.00");
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
	public void printFullName(int codice, String nome) {
		String fullName= codice + nome;
		System.out.println("Full name = " + fullName); 
	}
	
	public void printivaPrice(double price) {
		double ivaPrice = price + (price * iva / 100);
		System.out.println("Prezzo con Iva =  " + round.format(ivaPrice) + " euro");
	}
	
	public void printBasePrice(double price) {
		System.out.println("Prezzo base Prodotto = "+round.format(price) + " euro");
	}
	
	public int padCode(int codice) {
		String stringCode = String.format("%08d",codice);
		System.out.printf("Codice con left pad -> " + String.format("%08d",codice));
		return codice= Integer.parseInt(stringCode);
	}
	
	
	
	
}
