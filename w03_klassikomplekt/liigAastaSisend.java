import java.util.*; 
public class liigAastaSisend {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programmiga leiate kas antud aasta on liigaasta.");
		System.out.println("Sisestage aasta:");
        int aasta = sc.nextInt(); //Scanner loeb sisse täisarvu
        liigAastaValjund.pikkAasta(aasta);
        sc.close();
    }
}