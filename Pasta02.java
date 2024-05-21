package projetosJava;
import java.util.Scanner;
public class Pasta02 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Preço dos Produtos:");
		System.out.println("---------------------------");
		System.out.println("Alimentos:");
		System.out.println("---------------------------");
		System.out.println("1. Arroz: ");
		float arroz = leitor.nextFloat();
		System.out.println("2. Feijão: ");
		float feijao= leitor.nextFloat();
		System.out.println("3. Macarrão: ");
		float macarrao= leitor.nextFloat();
		System.out.println("4. Açucar: ");
		float acucar= leitor.nextFloat();
		System.out.println("5. Sal: ");
		float sal= leitor.nextFloat();
		System.out.println("---------------------------");
		
		leitor.close();
		
	}

}