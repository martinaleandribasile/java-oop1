package org.lessons.java.bank;

import java.util.Random;

public class Conto {
	Random r = new Random();
	String nomeProprietario;
	double saldo;
	int numeroConto;
	public Conto(String nomeProprietario) {
		super();
		this.nomeProprietario = nomeProprietario;
		this.numeroConto= r.nextInt(1000);
		this.saldo=0;
		
	}
	 public double deposita(double value) {
		 this.saldo += value;
		 return this.saldo;
	 }
	 
	 public boolean ritira(double value) {
		 if(value>this.saldo) {
			 return false;
		 }else {
			 this.saldo -= value;
			 return true; 
		 }
		
	 }
	
}
