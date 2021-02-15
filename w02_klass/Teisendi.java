import java.util.*;
public class Teisendi{
 
	public static void main(String[] args) {
 
		double kogus, valuuta;
		Scanner sc = new Scanner(System.in); //Loon scanner objekti sisendi püüdmiseks
 
		System.out.println("Valuuta teisendamiseks sisestage number 1-3ni.");
		System.out.println("1:Dollar 2:Nael 3:Euro");
		valuuta = sc.nextInt(); //Scanner loeb sisse täisarvu
		
		System.out.println("Sisestage summa:");
		kogus = sc.nextFloat(); //Scanner loeb sisse ujukomaarvu
        
        sc.close(); //Sulgen scanneri

		if (valuuta == 1) { 
            //Dollari teisendamine
            Valuutad.Dollar(kogus);	

        } else if (valuuta == 2) {
			//Naela teisendamine
            Valuutad.Nael(kogus);	

		} else if (valuuta == 3) {
			//Euro teisendamine
            Valuutad.Euro(kogus);	

		} else {
			System.out.println("Kehtetu sisend, proovige uuesti!");
		}
		
	}
 
}