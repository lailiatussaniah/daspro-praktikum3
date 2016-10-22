package praktikum3;
//Lailiatus Saniah (15650057)
public class empatb {
	public static void main(String[] args) {
		double a=1; //menghitung akar dari x^2+2x-4
		double b=2;
		double c=(-4);
		double D= (b*b-4*a*c);
		double x1,x2;
		
		System.out.println(" Persaman kuadrat a*x^2+b*x+c, dimana ");
		System.out.println(" a= "+a);
		System.out.println(" b= "+b);
		System.out.println(" c= "+c);
		System.out.println(" dengan menerapkan rumus ABC diketahui bahwa :");
		
if (D<0)
{
 System.out.println("akar akarnya Imajiner, yaitu ");
}
else if (D==0)
{
 System.out.print(" akar akar nya sama, yaitu ");
 x1=-b/2*a;
 System.out.print(" x1 = "+x1);
}
else
{
	System.out.println(" akar - akarnya berbeda, yaitu ");
	x1=(-b+Math.sqrt(D))/(2*a);
	x2=(-b-Math.sqrt(D))/(2*a);
	System.out.println(" Akarnya adalah\n"+x1+"\ndan\n"+x2);
}
 }
  }
