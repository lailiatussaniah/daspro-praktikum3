package praktikum3;
//Lailiatus Saniah (15650057)
public class dua_volume {
	public static void main(String[] args) {
	//input
		int pp=20; //panjang persegipanjang
		int lp=30; //lebar persegi panjang
		int as=20; //alas segitiga
		int ts=10; //tinggi segitiga
		int r=10; //jari-jari
		double phi=3.14;
		int t=10; //tinggi semua bangun
	//proses
		int vpersegipanjang=(pp*lp*t);
		int vsegitiga=(as*ts*t*1/2);
		double vlingkaran=(double)(phi*r*r*t);
	//output
		System.out.println(" Volume dari bangun persegi panjang adalah = "+vpersegipanjang);
		System.out.println(" Volume dari bangun segitiga adalah = "+vsegitiga );
		System.out.println(" Volume dari bangun lingkaran adalah = "+vlingkaran);
	}
}