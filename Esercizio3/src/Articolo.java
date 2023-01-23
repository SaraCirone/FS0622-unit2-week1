/*
 * Articolo: 

- codice articolo
- descrizione articolo
- prezzo
- numero pezzi disponibili in magazzino

 */
public class Articolo {

	String nomeArt;
	String codiceArt; 
	double prezzoArt; 
	String descrizioneArt;
	int dispArt; 
	
	
	public Articolo(String codiceArt, String nomeArt, double prezzoArt, String descrizioneArt, int dispArt) {
		this.codiceArt = codiceArt; 
		this.nomeArt = nomeArt; 
		this.prezzoArt = prezzoArt; 
		this.descrizioneArt = descrizioneArt; 
		this.dispArt = dispArt; 
	}



	
	public String getNomeArt() {
		return nomeArt;
	}

	public void setNomeArt(String nomeArt) {
		this.nomeArt = nomeArt;
	}

	public String getCodiceArt() {
		return codiceArt;
	}

	public void setCodiceArt(String codiceArt) {
		this.codiceArt = codiceArt;
	}

	public double getPrezzoArt() {
		return prezzoArt;
	}

	public void setPrezzoArt(double prezzoArt) {
		this.prezzoArt = prezzoArt;
	}

	public String getDescrizioneArt() {
		return descrizioneArt;
	}

	public void setDescrizioneArt(String descrizioneArt) {
		this.descrizioneArt = descrizioneArt;
	}
	public int getDispArt() {
		return dispArt;
	}

	public void setDispArt(int dispArt) {
		this.dispArt = dispArt;
	}

	public void stampaArticolo() {
		
		System.out.println("Codice articolo: " + codiceArt);
		System.out.println("Nome articolo: " + nomeArt);
		System.out.println("Descrizione articolo: " + descrizioneArt); 
		System.out.println("Prezzo Articolo " +  prezzoArt);
		System.out.println("Disponibilità articolo: " + dispArt);
	}
}
