package vetores;
import java.util.Scanner;

public class inverso {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a[], b[], i, j=9;
		final int TAM = 10;
		
		a = new int [TAM];
		b= new int [TAM];
	
		for (i=0; i<TAM; i++) {
		System.out.println("Digite o "+(i+1)+"° Valor");
		a[i]= in.nextInt();
		b[j]= a[i];
		j--;
		}
		
		System.out.print("\nVetor A [ ");
		for (i=0;i<TAM;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print(" ] ");
		
		System.out.print("nVetor B [ ");
		for (i=0;i<TAM;i++) {
			System.out.print(b[i]+" ");
	}
		System.out.print(" ] ");

	}
}
