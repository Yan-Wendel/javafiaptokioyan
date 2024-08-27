package javatokioyan;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		System.out.println("Digite nome e iade: ");
		String nome = ler.nextLine();
		int idade = ler.nextInt();
		
		System.out.println("O nome: " + nome);
		System.out.println("A idade: " + idade);

	}

}
