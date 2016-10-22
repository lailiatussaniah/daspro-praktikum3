package praktikum3;
//Lailiatus Saniah (15650057)
public class satu {
	public static void main(String[] args) {
//input
		int a=10;int b=12;int c=9;int e=2;int f=9;int n=90;
//Operator Aritmatika
	// proses
		int hasil1=(a+b);
		int hasil2=(a-b);
		float hasil3=(float)(a/b);
		int hasil4=(a*b);
		int hasil5=(a%e);
	// output
		System.out.println("Operator Aritmatika====================\n");
		System.out.println("Hasil dari a+b adalah "+hasil1);
		System.out.println("Hasil dari a-b adalah "+hasil2);
		System.out.println("Hasil dari a/b adalah "+hasil3);
		System.out.println("Hasil dari a*b adalah "+hasil4);
		System.out.println("Hasil dari a%b adalah "+hasil5);
//Operator Relasi
	//proses
		boolean cek1=(b>c);
		boolean cek2=(b>=c);
		boolean cek3=(b<c);
		boolean cek4=(b<=c);
		boolean cek5=(b==c);
		boolean cek6=(b!=c);
	//output
		System.out.println("Operator Relasi====================\n");
		System.out.println("Hasil dari b>c adalah "+cek1);
		System.out.println("Hasil dari b>=c adalah "+cek2);
		System.out.println("Hasil dari b<c adalah "+cek3);
		System.out.println("Hasil dari b<=c adalah "+cek4);
		System.out.println("Hasil dari b==c adalah "+cek5);
		System.out.println("Hasil dari b!=c adalah "+cek6);
//Operator Increment dan Decrement
	//proses
		int jumlah1=(++a);
		int jumlah2=(--a);
		int jumlah3=(a++);
		int jumlah4=(a--);
		int jumlah5=(a);
	//output
		System.out.println("Operator Increment dan Decrement==========\n");
		System.out.println("Hasil dari ++a adalah "+jumlah1);
		System.out.println("Hasil dari --a adalah "+jumlah2);
		System.out.println("Hasil dari a++ adalah "+jumlah3);
		System.out.println("Hasil dari a-- adalah "+jumlah4);
		System.out.println("Hasil dari a adalah = "+jumlah5);

//Operator Logika
	//proses
		boolean tes1=((a>b)||(c==f));
		boolean tes2=((a==b)&(b==++f));
		boolean tes3=((b>a)^(f==--a));
	//output
		System.out.println(" Operator Logika====================");
		System.out.println(" Hasil dari(a>b)||(c==f)) adalah "+tes1);
		System.out.println(" Hasil dari (a==b)&(b==++f) adalah "+tes2);
		System.out.println(" Hasil dari (b>a)^(f==-a) adalah "+tes3);
//Operator kondisi
	//proses
	 String status=(n>=60)?"passed":"ngulang";
	//output
	 System.out.println(" Operator kondisi====================");
	 System.out.println(status);
	}
}