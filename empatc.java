package praktikum3;
//Lailiatus Saniah (15650057)
public class empatc {
	public static void main(String[] args) {
	//input
		double a=3;
		double b=13;
	//proses
		double akar13=Math.sqrt(b);
		double p=(a+akar13);
		double q=(a-akar13);
		double pp=Math.pow(p, 2); //p pangkat 2
		double qq=Math.pow(q, 2); //q pangkat 2
		double p2q2=(pp+qq); //p pangkat 2 + q pangkat 2
		
		System.out.print(" Hasilnya adalah = "+p2q2);
	}

}
