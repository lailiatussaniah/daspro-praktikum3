package praktikum3;
//Lailiatus Saniah (15650057)
public class empatb2 {
	public static void main(String[] args) {
		double a=2; //menghitung akar dari 2x^2+6x-10
		double b=6;
		double c=(-10);
		double D= (b*b-4*a*c);
		double x1,x2;
if (D<0)
{System.out.println("akar - akarnya Imajiner");}
else if (D==0)
{System.out.println("akar - akarnya sama yaitu ");
	x1=-b/2*a;
	System.out.println(" akar - akarnya adalah x1=x2, yaitu "+x1);
}
else
{
	System.out.println(" akar - akar persamaannya adalah ");
	x1=(-b+Math.sqrt(D))/(2*a);
	x2=(-b-Math.sqrt(D))/(2*a);
	System.out.println(" x1 = "+x1);
	System.out.println(" x2 = "+x2);}}}
