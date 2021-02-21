public class liigAastaValjund {
        
    public static void pikkAasta(int aasta) {
    if (liigAastaTehted.Arvutused(aasta)){
        System.out.println(aasta + " on liigaasta.");
    }
    else {
    System.out.println(aasta + " ei ole liigaasta.");
    
    }
}
}