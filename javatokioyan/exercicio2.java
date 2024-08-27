package javatokioyan;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

        // Solicita ao usuário que insira seu nome
        System.out.print("Digite seu nome: ");
        String nome = ler.nextLine();  // Lê a linha de entrada fornecida pelo usuário

        // Exibe o nome armazenado na tela
        System.out.println("O nome digitado é: " + nome);
        
	}

}
