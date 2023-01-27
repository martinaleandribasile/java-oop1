package org.lessons.java.bank;

import java.text.DecimalFormat;
import java.util.Random;

public class Conto {
	private static final DecimalFormat round = new DecimalFormat("0.00");
	Random r = new Random();
	String nomeProprietario;
	double saldo;
	int numeroConto;
	public Conto(String nomeProprietario) {
		super();
		this.nomeProprietario = nomeProprietario;
		this.numeroConto= r.nextInt(1000);
		this.saldo=0;
		System.out.println("Lei ha appena aperto il suo conto, ecco i dati:");
		System.out.println("Nominativo: " + this.nomeProprietario);
		System.out.println("Numero del Conto: " + this.numeroConto);
		System.out.println("Saldo: " + round.format(saldo) + " euro");
	}
	 public double deposita(double value) {
		 this.saldo += value;
		 System.out.println("Ora il suo saldo e' di : " + this.saldo + " euro");
		 return this.saldo;
	 }
	 
	 public double ritira(double value) {
		 this.saldo -= value;
		 System.out.println("Ora il suo saldo e' di : " + this.saldo + " euro");
		 if(this.saldo<0) System.out.println("Attenaione il conto e' in negativo, si consiglia di effettuare un deposito.");
		 return this.saldo;
	 }
	
}
