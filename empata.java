package praktikum3;
//Lailiatus Saniah (15650057)
public class empata {
	public static void main(String[] args) {
	//input
		int a=10; int b=2;
		double pangkat_a=Math.pow(a,2); //disoal tertulis akar padahal 'Math.pow' digunakan untuk menghitung pangkat
		double pangkat_b=Math.pow(b,3);
		double penjumlahan_keduanya=pangkat_a+pangkat_b;
	//proses
		System.out.println(" akar a = "+pangkat_a);
		System.out.println(" akar b = "+pangkat_b);
		System.out.println(" jumlah kedua akar adalah = "+penjumlahan_keduanya);
		

	}
}
