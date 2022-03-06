//Jogo de Adivinhação

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
		System.out.println("Bem vindo ao jogo de Adivinhação!");
		System.out.println("*********************************");
		System.out.println("\nQual é o seu nome? ");
		String nome = input.nextLine();
		System.out.println("\nPrazer em conhece-lo " + nome + "!");
		System.out.println("Você quer jogar comigo? ");
		System.out.println("\nInforme o número da sua opção.\n1 - Sim \n2 - Não");
		opcao = input.nextInt();

		if (opcao == 2) {
			System.out.println("Que pena! mas tudo bem, fica para a próxima.");
		} else if (opcao == 1) {
			System.out.println("\nO jogo será assim:");
			System.out.println("\nEu vou escolher um número de 1 a 10");
			System.out.println("Mas não vou falar para você qual foi");
			System.out.println("Se você conseguir adivinhar o número,");
			System.out.println("Você será o vencedor!");
			System.out.println("\n.");
			System.out.println("..");
			System.out.println("...");

			escolha_computador = gerador.nextInt(10) + 1;

			System.out.println("\nOk, " + nome + ". Eu já escolhi um número!");
			System.out.println("Agora tente adivinhar!");
			escolha_usuario = input.nextInt();
			contador++;

			while (escolha_computador != escolha_usuario) {
				if (escolha_usuario > escolha_computador) {
					System.out.println("O número que você escolheu é maior");
				} else {
					System.out.println("O número que você escolheu é menor");
				}
				if (escolha_usuario >= 11) {
					System.out.println("Os números escolhidos devem ser entre 1 e 10");
				}
				System.out.println("\nTente outro número!");
				escolha_usuario = input.nextInt();
				contador++;
			}
			System.out.println("Parabéns! Você acertou com " + contador + " tentativas.");
		}
	}
}