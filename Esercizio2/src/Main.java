/*
 È necessario scrivere un'applicazione che simula il funzionamento di un frammento del sistema informativo di un operatore telefonico. 
Si devono rappresentare i dati relativi ad una certa SIM:
- Numero di telefono
- Credito disponibile in euro
- Lista delle ultime 5 chiamate

Per ciascuna chiamata deve essere rappresentata la durata in minuti ed il numero chiamato

La classe Sim dovrà fornire le seguenti funzionalità: 
- un costruttore che crea una SIM con numero di telefono passato come parametro, credito a 0 e la lista delle chiamate vuota, 
- una funzione per la stampa dei dati della SIM
 */
public class Main {

	public static void main(String[] args) {
		
		Sim s1 = new Sim("3403687880", 5);
		Chiamate chiamata1 = new Chiamate("+39 3335474582", 20);
		Chiamate chiamata2 = new Chiamate("+39 5482452165", 10);
		Chiamate chiamata3 = new Chiamate("+39 5821741475", 5);
		
        s1.getListaChiamate()[0] = chiamata1;
        s1.getListaChiamate()[1] = chiamata2;
        s1.getListaChiamate()[2] = chiamata3;

        System.out.println("--------------------------------------------------------------------");

        s1.stampaDati();

        System.out.println("--------------------------------------------------------------------");
	}

}
