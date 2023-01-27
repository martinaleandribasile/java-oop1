package org.lessons.java.bank;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String nomeUtente;
		String operazione="";
		
		System.out.println("Inserisci il tuo nome per l'apertura del conto:");
		nomeUtente=s.nextLine().trim();
		Conto newConto = new Conto(nomeUtente);
		
		
		operazione= operazioni(operazione);
		
		while(!operazione.equals("3")) {
			if(operazione.equals("1") ) {
				System.out.println("Inserisca la somma da depositare (numeri decimali divisi dalla ,)");
				double deposito= s.nextDouble();
				newConto.deposita(deposito);
				operazione= operazioni(operazione);
			}else if(operazione.equals("2")) {
				System.out.println("Inserisca la somma da ritirare (numeri decimali divisi dalla ,)");
				double ritiro = s.nextDouble();
				newConto.ritira(ritiro);
				operazione= operazioni(operazione);
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


