import java.util.*;
import java.text.DecimalFormat;

public class TempTeisendi{
    public static void main(String[] args){
        DecimalFormat dgr = new DecimalFormat("##.###");
        Scanner sc=new Scanner(System.in);
	    System.out.println("Valige teisendatav temperatuur:\n\n 1. Fahrenheit Celsiuseks\n 2. Celsius Fahrenheitiks\n 3. Celsius Kelviniks\n 4. Fahrenheit Kelviniks \n 5. Kelvin Celsiuseks \n 6. Kelvin Fahrenheitiks");
        System.out.println();
        int choice=sc.nextInt();
        
        if (choice == 1){
            System.out.println();
            System.out.println("Sisestage Fahrenheitid:");
            System.out.println();
            double f = sc.nextDouble();
            sc.close();
            TempLiides cels = new TempValemid();
            System.out.println();
            System.out.println(f + " fahrenheiti võrdub " + dgr.format(cels.celsius(f)) + " celsiust.");

        }else if (choice == 2){
            System.out.println();
            System.out.println("Sisestage Celsiused:");
            System.out.println();
            double c = sc.nextDouble();
            sc.close();
            TempLiides fahr = new TempValemid();
            System.out.println();
            System.out.println(c + " celsiust võrdub " + dgr.format(fahr.fahrenheit(c)) + " fahrenheiti.");

        }else if (choice == 3){
            System.out.println();
            System.out.println("Sisestage Celsiused:");
            System.out.println();
            double c = sc.nextDouble();
            sc.close();
            TempLiides ckelv = new TempValemid();
            System.out.println();
            System.out.println(c + " celsiust võrdub " + dgr.format(ckelv.ctokelvin(c)) + " kelvinit.");

        }else if (choice == 4){
            System.out.println();
            System.out.println("Sisestage Fahrenheitid:");
            System.out.println();
            double f = sc.nextDouble();
            sc.close();
            TempLiides fkelv = new TempValemid();
            System.out.println();
            System.out.println(f + " fahrenheiti võrdub " + dgr.format(fkelv.ftokelvin(f)) + " kelvinit.");
        
        }else if (choice == 5){
            System.out.println();
            System.out.println("Sisestage Kelvinid:");
            System.out.println();
            double f = sc.nextDouble();
            sc.close();
            TempLiides kelc = new TempValemid();
            System.out.println();
            System.out.println(f + " kelvinit võrdub " + dgr.format(kelc.kelvintoc(f)) + " celsiust.");
       
        }else if (choice == 6){
            System.out.println();
            System.out.println("Sisestage Kelvinid:");
            System.out.println();
            double f = sc.nextDouble();
            sc.close();
            TempLiides kelf = new TempValemid();
            System.out.println();
            System.out.println(f + " kelvinit võrdub " + dgr.format(kelf.kelvintof(f)) + " fahrenheiti.");
        }
    }
}