public class Funktsioonid1{
	public static String temperatuuriHinnang(int t){
		if(t<18){return "Külm";}
		return "soe";
	}
	public static double ringiPindala(double r){
		return Math.PI*r*r;
	}
	public static double taksoHind(double i){	
		return 3+i*0.80;	
	}
	public static void main(String[] arg){
			System.out.println(taksoHind(20));
	}
}

