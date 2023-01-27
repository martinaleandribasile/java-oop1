package org.lessons.java.bank;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Bank {
	private static final DecimalFormat round = new DecimalFormat("0.00");
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String nomeUtente;
		String operazione="";
		
		System.out.println("Inserisci il tuo nome per l'apertura del conto:");
		nomeUtente=s.nextLine().trim();
		Conto newConto = new Conto(nomeUtente);
		System.out.println("Lei ha appena aperto il suo conto, ecco i dati:");
		System.out.println("Nominativo: " + newConto.nomeProprietario);
		System.out.println("Numero del Conto: " + newConto.numeroConto);
		System.out.println("Saldo: " + round.format(newConto.saldo) + " euro");
		
		operazione= operazioni(operazione);
		
		while(!operazione.equals("3")) {
			if(operazione.equals("1") ) {
				System.out.println("Inserisca la somma da depositare (numeri decimali divisi dalla ,)");
				double deposito= s.nextDouble();
				newConto.deposita(deposito);
				System.out.println("Ora il suo saldo e' di : " + newConto.saldo + " euro");
				operazione= operazioni(operazione);
			}else if(operazione.equals("2")) {
				if(newConto.saldo == 0) {
					System.out.println("mi dispiace non e' possibile effettuare un ritiro , il suo conto non ha disponibilita'.");
					operazione= operazioni(operazione);
				}else {
					System.out.println("Inserisca la somma da ritirare (numeri decimali divisi dalla ,)");
					double ritiro = s.nextDouble();
					if(newConto.saldo == 0 || ritiro > newConto.saldo) {
						System.out.println("mi dispiace non e' possibile effettuare un ritiro , la disponibilita' non e'sufficiente");
						operazione= operazioni(operazione);
					}else {
						newConto.ritira(ritiro);
						 System.out.println("Ora il suo saldo e' di : " + newConto.saldo + " euro");
						operazione= operazioni(operazione);
					}
				}
			}else {
				System.out.println("Mi dispiace la sua richiesta non e' valida riprovi:");
				operazione= operazioni(operazione);
			}
		}
		System.out.println("Grazie a arrivederci!");
			
	}
	 public static String operazioni(String operazione) {
		 Scanner s = new Scanner(System.in);
		 System.out.println("Per VERSARE denaro digiti 1, per PRELEVARE denaro digiti 2, per USCIRE dal suo conto digiti 3");
		 operazione= s.nextLine();
		 return operazione;
	 }
}


