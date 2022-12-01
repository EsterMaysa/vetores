package vetores;
import java.util.Scanner;
public class raizQua {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double a[], b[];
		int i;
		
		final int TAM = 10;
		
		a = new double [TAM];
		b= new double [TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Digite "+(i+1)+" número:");
			a[i]=in.nextDouble();
			b[i]= a[i]*a[i];
			
			
		}System.out.print("n/VetorA [");
		for(i=0; i<TAM; i++) {
			System.out.print(a[i]+" ");
		
		}System.out.print(" ]");
		
		System.out.print("n/VetorB [");
		for(i=0; i<TAM; i++) {
		
			System.out.print(b[i]+" ");
		}
		System.out.print(" ]");
	}
}
