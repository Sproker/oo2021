public class TempValemid implements TempLiides{
    public double celsius(double f){
        double tempc = (f-32)*5/9;
        return tempc;
    }
    public double fahrenheit(double c){
        double tempf = ((9*c)/5)+32;
        return tempf;
    }
    public double ctokelvin(double c){
        double tempk = c + 273.15;
        return tempk;
    }
    public double ftokelvin(double f){
        double tempk2 = ((f-32)*5/9) + 273.15;
        return tempk2;
    }
    public double kelvintoc(double k){
        double tempk3 = k - 273.15;
        return tempk3;
    }
    public double kelvintof(double k){
        double tempk4 = 1.8*(k - 273) + 32;
        return tempk4;
    }
}