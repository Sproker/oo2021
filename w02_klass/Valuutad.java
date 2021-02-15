import java.text.DecimalFormat;
public class Valuutad {
    private double Bitcoin;
    public static void Dollar(double kogus) { // Dollari Teisendamine
        DecimalFormat f = new DecimalFormat("##.##");
        DecimalFormat c = new DecimalFormat("##.######");
        double Nael, euro;

        Nael = kogus * 0.72;
		System.out.println(f.format(kogus) + " dollarit on: " + f.format(Nael) + " naela.");

		euro = kogus * 0.82;
		System.out.println(f.format(kogus) + " dollarit on: " + f.format(euro) + " eurot.");
        
        //Loome uue eksemplari, et teisendada väärtus bitcoinidesse
        Valuutad uusTeisendus = new Valuutad();
        uusTeisendus.Bitcoin = kogus * 0.000021;
        System.out.println(f.format(kogus) + " dollarit on: " + c.format(uusTeisendus.Bitcoin) + " bitcoini.");
    }
    public static void Nael(double kogus) { //Naela teisendamine
        DecimalFormat f = new DecimalFormat("##.##");
        DecimalFormat c = new DecimalFormat("##.######");
        double dollar, euro;

        dollar = kogus * 1.39;
        System.out.println(f.format(kogus) + " naela on: " + f.format(dollar) + " dollarit.");

        euro = kogus * 1.15;
        System.out.println(f.format(kogus)+ " naela on: " + f.format(euro) + " eurot.");

        //Loome uue eksemplari, et teisendada väärtus bitcoinidesse
        Valuutad uusTeisendus = new Valuutad();
        uusTeisendus.Bitcoin = kogus * 0.000029;
        System.out.println(f.format(kogus) + " naela on: " + c.format(uusTeisendus.Bitcoin) + " bitcoini.");
    }
    public static void Euro(double kogus) { //Euro teisendamine 
        DecimalFormat f = new DecimalFormat("##.##");
        DecimalFormat c = new DecimalFormat("##.######");
        double dollar, Nael;

        dollar = kogus * 1.21;
        System.out.println(f.format(kogus) + " eurot on: " + f.format(dollar) + " dollarit.");

        Nael = kogus * 0.87;
        System.out.println(f.format(kogus) + " eurot on: " + f.format(Nael) + " naela.");
        
        //Loome uue eksemplari, et teisendada väärtus bitcoinidesse
         Valuutad uusTeisendus = new Valuutad();
         uusTeisendus.Bitcoin = kogus * 0.000025;
         System.out.println(f.format(kogus) + " eurot on: " + c.format(uusTeisendus.Bitcoin) + " bitcoini.");
    }
}
