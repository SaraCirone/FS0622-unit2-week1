public class Main {

	public static void main(String[] args) {
		
		
		Articolo art1 = new Articolo("A01", "Samsung Galaxy S21",   459.9 , "Smartphone Samsung di ultima generazione", 3);
		art1.stampaArticolo();
		System.out.println("---------------------");
		Articolo art2 = new Articolo("A02", "Aspiravolvere",   110.0 , "Aspirapolvere Dyson", 3);
		art2.stampaArticolo();
		System.out.println("---------------------");
		
		Cliente cliente1 = new Cliente("C01", "Giacomo Verdi", "gverdi@gmail.com", "10 maggio");
		cliente1.stampaCliente();
		
	
	
		System.out.println("---------------------");
		Carrello car01 = new Carrello(cliente1.codiceCliente, cliente1.nomeCognome, 0);
		CarrelloUtente lista1 = new CarrelloUtente(art1.nomeArt, art1.prezzoArt);
		CarrelloUtente lista2 = new CarrelloUtente(art2.nomeArt, art2.prezzoArt);
		CarrelloUtente lista3 = new CarrelloUtente("Sciarpa Viola", 5);
		car01.getElencoArticoli()[0] = lista1;
		car01.getElencoArticoli()[1] = lista2;
		car01.getElencoArticoli()[2] = lista3;
		car01.stampaCarrello();
		
		
	
		
		
	}

}
