package conta_bancaria;

import java.util.Scanner;


import conta_bancaria.model.Conta;
import conta_bancaria.model.ContaCorrente;
import conta_bancaria.model.ContaPoupança;
import conta_bancaria.util.Cores;

public class Menu {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		// Teste da Classe Conta
		Conta c1 = new Conta(1, 123, 1, "Adriana", 10000.0f);
		c1.visualizar();
		System.out.println("exibir o Soldo: " + c1.getSaldo());
		c1.setSaldo(2000000.00f);
		c1.visualizar();
		c1.sacar(210000.00f);
		c1.visualizar();
		c1.depositar(5000.0f);
		c1.visualizar();

		Conta c2 = new Conta(2, 123, 1, "Vitor Nascimento", 300000.00f);
		c2.visualizar();
		
		ContaCorrente cc1 = new ContaCorrente(3, 456, 1, "Felipe", 100000.00f, 2000.00f);
		cc1.visualizar();
		cc1.sacar(201000.00f);
		cc1.visualizar();
		
		ContaPoupança cp1 = new ContaPoupança (3, 567, 2, "Aline", 2000.00f, 2000.00f, 2);
		cp1.visualizar();
		cp1.depositar(500.00f);
		
		

		int opcao = 0;
		
		

		while (true) {

			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                BANCO LATINOAMERICANO                ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);
			opcao = leia.nextInt();
			
			opcao = leia.nextInt();

			if (opcao == 9) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nBanco do Brazil com Z - O seu Futuro começa aqui!");
                  		sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE + "Criar Conta\n\n");

				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE + "Listar todas as Contas\n\n");

				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE + "Consultar dados da Conta - por número\n\n");

				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE + "Atualizar dados da Conta\n\n");

				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE + "Apagar a Conta\n\n");

				break;
			case 6:
				System.out.println(Cores.TEXT_WHITE + "Saque\n\n");

				break;
			case 7:
				System.out.println(Cores.TEXT_WHITE + "Depósito\n\n");

				break;
			case 8:
				System.out.println(Cores.TEXT_WHITE + "Transferência entre Contas\n\n");

				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
				break;
			}
		}
	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Produzido por: Aline Conchetta");
		System.out.println("Aline Conchetta - alineconchetta@gmail.com");
		System.out.println("github.com/AlineConchetta");
		System.out.println("*********************************************************");
	}

}