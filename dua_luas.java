package praktikum3;
//Lailiatus Saniah (15650057)
public class dua_luas {
	public static void main(String[] args) {
	//input
		int pp=20; //Panjang persegi panjang
		int lp=30; // lebar persegi panjang
		int as=20; // alas segitiga
		int ts=10; // tinggi segitiga
		double pi=(double)3.14; //nilai phi
		int r=10; // jari - jari
	//proses
		int Luas_persegi_panjang=(pp*lp);
		int Luas_segitiga=((as*ts)/2);
		double Luas_lingkaran=(double)(pi*r*r);
		
	//output
		System.out.println("++++Menghitung nilai dan volume++++\n");
		System.out.println(" Luas dari persegi panjang adalah = "+Luas_persegi_panjang);
		System.out.println(" Luas dari segitiga adalah = "+Luas_segitiga);
		System.out.println(" Luas dari lingkaran adalah = "+Luas_lingkaran);
	}

}
