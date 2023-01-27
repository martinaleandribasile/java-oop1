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
	}
	
	public String getSaldo() {
		String saldoStr= round.format(this.saldo);
		return saldoStr;
	}
	public String getProprietario() {
		return this.nomeProprietario;
	}
	public int getNumeroConto() {
			return this.numeroConto;
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
