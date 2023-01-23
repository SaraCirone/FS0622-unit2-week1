
public class Cliente {
	
	String codiceCliente; 
	String nomeCognome; 
	String email; 
	String dataIscrizione; 

	public Cliente(String codiceCliente, String nomeCognome, String email, String dataIscrizione) {
		this.codiceCliente = codiceCliente; 
		this.nomeCognome = nomeCognome; 
		this.email = email; 
		this.dataIscrizione = dataIscrizione; 
	}
	
	public void stampaCliente() {
		
		
		System.out.println("Codice Cliente: " + codiceCliente); 
		System.out.println("Nome Cliente: " + nomeCognome);
		System.out.println("Email Cliente: " +  email);
		System.out.println("Data iscrizione Cliente:  " + dataIscrizione);
		
	}
	
}
