//Scanner klassi importimine java.utilist    
import java.util.Scanner;
public class Ascii2   
{  
    public static void sisend() {
    //Scanner objekti deklareerimine kasutajalt sisendi saamiseks
    Scanner sc = new Scanner(System.in);
    System.out.println("Sisestage tahemark, mida soovite Asciisse teisendada:");   
    System.out.println("");
    
    /*Scanneriga kasutajalt sisendi püüdmine, next() funk. tagastab kasutaja 
    sisestatud sõna/märgi stringina ning charAt(0) tagastab esimese tähemärgi tolles stringis*/
    char ch = sc.next().charAt(0);
    
    //Sulgeme scanner objekti
    sc.close();
    System.out.println("");
    
    //Sisendi teisendamine Ascii väärtuseks ning selle kasutajale kuvamine 
    int ascii = (int) ch;  
    System.out.println("Tahemargi " + ch + " ascii vaartus on: " + ascii); 
    }   
    public static void main(String[] args)   
    {
    //Kutusume loodud funktsiooni välja
    sisend();
    }  
} 
