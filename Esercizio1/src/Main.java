/*Creare una classe rettangolo che permetta di rappresentare dei rettangoli. 
Per ogni rettangolo deve essere possibile specificare altezza e largezza in fase di costruzione dell'istanza e devono essere realizzati i metodi per calcolare il perimetro e l'area. 
Creare una funzione StampaRettangolo che, dato un rettangolo, stampi a video area e perimetro
Realizzare una funzione Stampa due rettangoli che, dati due rettangoli, stampi area e perimetro di ognuno e quindi la somma delle aree e dei perimetri. 
*/


public class Main {

	public static void main(String[] args) {
		
		Rettangolo r1 = new Rettangolo(6, 7);
		Rettangolo r2 = new Rettangolo(10, 20);
		r1.stampaRettangolo();
		
		Rettangolo.stampaDueRettangoli(r1, r2);
		
	}

}
