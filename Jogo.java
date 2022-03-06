//Jogo de Adivinha��o

import java.util.Scanner;
import java.util.Random;

public class Jogo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Random gerador = new Random();

		int opcao;
		int escolha_computador;
		int escolha_usuario;
		int contador = 0;

		System.out.println("\n*********************************");
		System.out.println("Bem vindo ao jogo de Adivinha��o!");
		System.out.println("*********************************");
		System.out.println("\nQual � o seu nome? ");
		String nome = input.nextLine();
		System.out.println("\nPrazer em conhece-lo " + nome + "!");
		System.out.println("Voc� quer jogar comigo? ");
		System.out.println("\nInforme o n�mero da sua op��o.\n1 - Sim \n2 - N�o");
		opcao = input.nextInt();

		if (opcao == 2) {
			System.out.println("Que pena! mas tudo bem, fica para a pr�xima.");
		} else if (opcao == 1) {
			System.out.println("\nO jogo ser� assim:");
			System.out.println("\nEu vou escolher um n�mero de 1 a 10");
			System.out.println("Mas n�o vou falar para voc� qual foi");
			System.out.println("Se voc� conseguir adivinhar o n�mero,");
			System.out.println("Voc� ser� o vencedor!");
			System.out.println("\n.");
			System.out.println("..");
			System.out.println("...");

			escolha_computador = gerador.nextInt(10) + 1;

			System.out.println("\nOk, " + nome + ". Eu j� escolhi um n�mero!");
			System.out.println("Agora tente adivinhar!");
			escolha_usuario = input.nextInt();
			contador++;

			while (escolha_computador != escolha_usuario) {
				if (escolha_usuario > escolha_computador) {
					System.out.println("O n�mero que voc� escolheu � maior");
				} else {
					System.out.println("O n�mero que voc� escolheu � menor");
				}
				if (escolha_usuario >= 11) {
					System.out.println("Os n�meros escolhidos devem ser entre 1 e 10");
				}
				System.out.println("\nTente outro n�mero!");
				escolha_usuario = input.nextInt();
				contador++;
			}
			System.out.println("Parab�ns! Voc� acertou com " + contador + " tentativas.");
		}
	}
}