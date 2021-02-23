import java.util.Scanner;
public class libisevKeskmine {
    public static void main(String[] args) {
        int numbrid, sum = 0;
        float keskmine;
        Scanner s = new Scanner(System.in);
        System.out.print("Mitme arvu keskmist soovite leida? ");
        numbrid = s.nextInt();
        int a[] = new int[numbrid];
        System.out.println("Sisestage " + numbrid + " täisarvu:");
        for(int i = 0; i < numbrid ; i++) {
            a[i] = s.nextInt();
            sum = sum + a[i]; }
            s.close();
        keskmine = (float)sum / numbrid;
        System.out.println("Arvude keskmine on: "+ keskmine);
        
        int[] b = libisevMassiiv(a);
        for(int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
    public static int[] libisevMassiiv(int[] a) {
        int[] tulemus = new int[a.length - 2];
        for(int i = 0; i < (a.length - 2); i++) {
            int summa = a[i] + a[i + 1] + a[i + 2];
            int keskmine = summa / 3;
            tulemus[i] = keskmine;
        }
        return tulemus;
    }
}


