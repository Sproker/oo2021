/* Koosta funktsioon, mille sisendiks on kahe kilomeetripikkuse lõigu läbimise kiirused (km/h), väljundiks nende kahe kilomeetri läbimise keskmine kiirus.

* Funktsioonile antakse ette kilomeetripikkuste lõikude läbimiste keskmised kiirused kogumina (km/h). Väljasta kogu selle tee läbimise keskmine kiirus.

* Kilomeetriste lõikude läbimiste keskmised kiirused loetakse sisse veebiaadressilt, kogu teekonna läbimise keskmine kiirus salvestatakse faili.
*/

import java.util.*;
import java.io.*;
public class harmoKesk {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double keskmine, korrutis, summa1;
        System.out.println("Programmiga kahe kilomeetri pikkuse lõigu keskmise kiiruse");
		System.out.println("Sisestage 2 täisarvu:");
        int arv1 = sc.nextInt();
        int arv2 = sc.nextInt();
        sc.close();
        
        //kahe arvu a ja b kahekordne korrutis jagatud nende arvude summaga 
        korrutis = (arv1*arv2)*2;
        summa1 = arv1+arv2;
        keskmine = (float)korrutis / summa1;
        System.out.println("Harmooniline keskmine on " + keskmine + " km/h");
      
        Scanner textfail = new Scanner(new File("arvud.txt"));
        filereader(textfail);
	} 
    public static void filereader(Scanner textfail){         
        float i = 0;         
        float sum = 0;          
        while(textfail.hasNextLine()){       
            int nextInt = textfail.nextInt();                     
            sum = sum + nextInt;
            i++;         
        }
        float keskm = (float)sum/(float)i;
        System.out.println("Failis arve kokku " + i);
        System.out.println("Nende summa " + sum);
        System.out.println("Keskmine kiirus on " + keskm);    
    }
}
