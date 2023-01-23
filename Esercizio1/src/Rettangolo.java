import java.util.Scanner;

public class Rettangolo {
	
	int x; 
	int y; 
	
	static Scanner scanner = new Scanner(System.in);

	public Rettangolo(int y, int x) {
		this.x = x;
		this.y = y; 
	}


	
	public void stampaRettangolo() {
		
		System.out.println("Valore di x " + x + " Valore di y "+ y);
		
		double perimetro1 = (x + y)*2;
		
		System.out.println("Il perimetro è :" + perimetro1);

		double area = (x*y);
		
		System.out.println("L'area è :" + area);
		
	}
	
	public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
		
		System.out.println("Valore di x " + r1.x + " Valore di y "+ r1.y);
		System.out.println("Valore di x " + r2.x + " Valore di y "+ r2.y);
		
		
		
		double sommaPerimetro = ((r1.x + r1.y)*2) + ((r2.x + r2.y)*2);
		
		System.out.println("La Somma dei perimetri è " + sommaPerimetro);
		
		double sommaArea = ((r1.x*r1.y) +(r2.x * r1.y));
		
		System.out.println("La Somma dei perimetri è " + sommaArea);
		
	}

}
