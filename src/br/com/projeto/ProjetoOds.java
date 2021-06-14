package br.com.projeto;

import java.util.Scanner;

public class ProjetoOds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int operacao = 0;
		int material = 0;
		double pontuacao = 0;
		double totalPontos = 0;
		double peso = 0;
		String endereco = null;
		String enderecoPessoa = null;
		int premioEscolhido = 0;
		String nomeCliente = null;

		String[] premios = new String[5];

		Cliente usuario1 = new Cliente();

			
		
		System.out.println(
				"                                        ______                           _          ___  _____        _   __ \r\n"
						+ "                                        | ___ \\                         | |        /   |/  ___|      | | / _|\r\n"
						+ "                                        | |_/ /  ___   ___  _   _   ___ | |  ___  / /| |\\ `--.   ___ | || |_ \r\n"
						+ "                                        |    /  / _ \\ / __|| | | | / __|| | / _ \\/ /_| | `--. \\ / _ \\| ||  _|\r\n"
						+ "                                        | |\\ \\ |  __/| (__ | |_| || (__ | ||  __/\\___  |/\\__/ /|  __/| || |  \r\n"
						+ "                                        \\_| \\_| \\___| \\___| \\__, | \\___||_| \\___|    |_/\\____/  \\___||_||_|  \r\n"
						+ "                                                             __/ |                                           \r\n"
						+ "                                                            |___/                  ");

		System.out.print(
				"\n|--------------------------------------------------------------------------------------------------------------------------------------------------|\n");
		System.out.print(
				"| (1) - NOVO CADASTRO                                             									           |\n");
		System.out.print(
				"| (2) - LISTAGEM DE PRÊMIOS                                                                                                                        |\n");
		System.out.print(
				"| (3) - SAIR                                                    									           |\n");
		System.out.print(
				"|--------------------------------------------------------------------------------------------------------------------------------------------------|\n");

		System.out.print("\nDIGITE UMA OPÇÃO: \n");
		operacao = scan.nextInt();

		if (operacao == 1) {
			System.out.println("INFORME O SEU NOME: ");
			usuario1.setNome(scan.nextLine());
			usuario1.setNome(scan.nextLine());

			nomeCliente = usuario1.getNome();
			System.out.println("INFORME O SEU CPF: ");
			usuario1.setCpf(scan.next());

			System.out.println(
					"\n=======================================================================================================================================================\n");
			System.out.println(
					"\n-------------------------------------------------------------------------------------------------------------------------------------------------------\n");
			System.out.println(
					"                                        ______                           _          ___  _____        _   __ \r\n"
							+ "                                        | ___ \\                         | |        /   |/  ___|      | | / _|\r\n"
							+ "                                        | |_/ /  ___   ___  _   _   ___ | |  ___  / /| |\\ `--.   ___ | || |_ \r\n"
							+ "                                        |    /  / _ \\ / __|| | | | / __|| | / _ \\/ /_| | `--. \\ / _ \\| ||  _|\r\n"
							+ "                                        | |\\ \\ |  __/| (__ | |_| || (__ | ||  __/\\___  |/\\__/ /|  __/| || |  \r\n"
							+ "                                        \\_| \\_| \\___| \\___| \\__, | \\___||_| \\___|    |_/\\____/  \\___||_||_|  \r\n"
							+ "                                                             __/ |                                           \r\n"
							+ "                                                            |___/                  ");

			System.out.println(
					"\n-------------------------------------------------------------------------------------------------------------------------------------------------------\n");
			System.out.println(
					"\n=======================================================================================================================================================\n");

			

			System.out.println("\nOLÁ " + nomeCliente.toUpperCase() + ".\n");
		}

		if (operacao == 2) {
			System.out.println(
					"\n============================================================= NOSSOS PRÊMIOS ======================================================================\n");

			System.out.print(
					"|--------------------------------------------------------------------------------------------------------------------------------------------------|\n");
			System.out.print(
					"| METAL  - PORTA-LAPIS      || PAPEL/PAPELÃO - AGENDA			||	VIDRO -	PORTA RETRATO    || 	PLÁSTICO - CAMISETA	           |\n");
			System.out.print(
					"| METAL  - FAQUEIRO         || PAPEL/PAPELÃO - FICHARIO			||	VIDRO -	VASO DECORATIVO  || 	PLÁSTICO - GUARDA-CHUVA            |\n");
			System.out.print(
					"| METAL  - GARRAFA TÉRMICA  || PAPEL/PAPELÃO - BALÃO JAPONÊS		||	VIDRO -	QUADRO       	 ||	PLÁSTICO - MALA    	           |\n");
			System.out.print(
					"| METAL  - PATINS           || PAPEL/PAPELÃO - BRINQUEDO CASA P/GATOS	||	VIDRO -	LUSTRE       	 ||	PLÁSTICO - BIKE		           |\n");
			System.out.print(
					"|--------------------------------------------------------------------------------------------------------------------------------------------------|\n");

			System.out.print(
					"\n|--------------------------------------------------------------------------------------------------------------------------------------------------|\n");
			System.out.print(
					"| (1) - NOVO CADASTRO                                             									           |\n");
			System.out.print(
					"| (2) - LISTAGEM DE PRÊMIOS                                                                                                                        |\n");
			System.out.print(
					"| (3) - SAIR                                                    									           |\n");
			System.out.print(
					"|--------------------------------------------------------------------------------------------------------------------------------------------------|\n");

			operacao = scan.nextInt();
 
			if (operacao == 1) {
				System.out.println("INFORME O SEU NOME: ");
				usuario1.setNome(scan.nextLine());
				usuario1.setNome(scan.nextLine());

				nomeCliente = usuario1.getNome();
				System.out.println("INFORME O SEU CPF: ");
				usuario1.setCpf(scan.next());

				System.out.println(
						"\n=======================================================================================================================================================\n");
				System.out.println(
						"\n-------------------------------------------------------------------------------------------------------------------------------------------------------\n");
				System.out.println(
						"                                        ______                           _          ___  _____        _   __ \r\n"
								+ "                                        | ___ \\                         | |        /   |/  ___|      | | / _|\r\n"
								+ "                                        | |_/ /  ___   ___  _   _   ___ | |  ___  / /| |\\ `--.   ___ | || |_ \r\n"
								+ "                                        |    /  / _ \\ / __|| | | | / __|| | / _ \\/ /_| | `--. \\ / _ \\| ||  _|\r\n"
								+ "                                        | |\\ \\ |  __/| (__ | |_| || (__ | ||  __/\\___  |/\\__/ /|  __/| || |  \r\n"
								+ "                                        \\_| \\_| \\___| \\___| \\__, | \\___||_| \\___|    |_/\\____/  \\___||_||_|  \r\n"
								+ "                                                             __/ |                                           \r\n"
								+ "                                                            |___/                  ");

				System.out.println(
						"\n-------------------------------------------------------------------------------------------------------------------------------------------------------\n");
				System.out.println(
						"\n=======================================================================================================================================================\n");


				System.out.println("\nOLÁ " + nomeCliente.toUpperCase() + "\n");
			}
		}

		if (operacao == 3) {
			System.out.println("\nOBRIGADO POR USAR O NOSSO SISTEMA");
			System.exit(0);
		}

		do {
			System.out.print(
					"|--------------------------------------------------------------------------------------------------------------------------------------------------|\n");
			System.out.print(
					"| (1) - PLÁSTICO                                            									                   |\n");
			System.out.print(
					"| (2) - METAL                                                  									                   |\n");
			System.out.print(
					"| (3) - PAPEL                                                    									           |\n");
			System.out.print(
					"| (4) - VIDRO                                                    									           |\n");
			System.out.print(
					"|--------------------------------------------------------------------------------------------------------------------------------------------------|\n");

			System.out.println("\nINFORME O TIPO DE MATERIAL: ");
			usuario1.setTipoMaterial(scan.nextInt());

			material = usuario1.getTipoMaterial();
			System.out.println("\nINFORME A QUANTIDADE EM KG DO MATERIAL: ");
			usuario1.setQtdMaterial(scan.nextDouble());

			peso += usuario1.getQtdMaterial();
			
			System.out.println(
					"\n========================================================================================================================================================\n");
			System.out.println(
					"\n----------------------------------------------------------------------------------------------------------------------------------------------------------\n");
			System.out.println(
					"\n--------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
			System.out.println(
					"                                        ______                           _          ___  _____        _   __ \r\n"
							+ "                                        | ___ \\                         | |        /   |/  ___|      | | / _|\r\n"
							+ "                                        | |_/ /  ___   ___  _   _   ___ | |  ___  / /| |\\ `--.   ___ | || |_ \r\n"
							+ "                                        |    /  / _ \\ / __|| | | | / __|| | / _ \\/ /_| | `--. \\ / _ \\| ||  _|\r\n"
							+ "                                        | |\\ \\ |  __/| (__ | |_| || (__ | ||  __/\\___  |/\\__/ /|  __/| || |  \r\n"
							+ "                                        \\_| \\_| \\___| \\___| \\__, | \\___||_| \\___|    |_/\\____/  \\___||_||_|  \r\n"
							+ "                                                             __/ |                                           \r\n"
							+ "                                                            |___/                  ");

			System.out.println(
					"\n-------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
			System.out.println(
					"\n-------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
			
			System.out.println(
					"\n========================================================== MATERIAL REGISTRADO COM SUCESSO!!! ===============================================================\n");

			if (material == 1) {
				System.out.println("PLÁSTICO");
				pontuacao = usuario1.getQtdMaterial() * 10;
			}
			if (material == 2) {
				System.out.println("METAL");
				pontuacao = usuario1.getQtdMaterial() * 2.5;
			}
			if (material == 3) {
				System.out.println("PAPEL");
				pontuacao = usuario1.getQtdMaterial() * 5;
			}
			if (material == 4) {
				System.out.println("VIDRO");
				pontuacao = usuario1.getQtdMaterial() * 7.5;
			}

			// Resultado de pontos
			totalPontos += pontuacao;
			System.out.println("\nTOTAL DE PONTOS: " + totalPontos);
			System.out.println("\nPESO TOTAL: " + peso + " kg");

			System.out.println(
					"\n==================================================================================================================================================================");

			System.out.println("\nDIGITE (1)-PARA INSERIR MAIS MATERIAIS OU (0)-PARA PROSSEGUIR COM O PROCESSO\n");
			operacao = scan.nextInt();
		} while (operacao == 1);

		System.out.println(
				"\n======================================================================================================================================================================\n");
		System.out.println(
				"\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
		System.out.println(
				"\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
		System.out.println(
				"                                        ______                           _          ___  _____        _   __ \r\n"
						+ "                                        | ___ \\                         | |        /   |/  ___|      | | / _|\r\n"
						+ "                                        | |_/ /  ___   ___  _   _   ___ | |  ___  / /| |\\ `--.   ___ | || |_ \r\n"
						+ "                                        |    /  / _ \\ / __|| | | | / __|| | / _ \\/ /_| | `--. \\ / _ \\| ||  _|\r\n"
						+ "                                        | |\\ \\ |  __/| (__ | |_| || (__ | ||  __/\\___  |/\\__/ /|  __/| || |  \r\n"
						+ "                                        \\_| \\_| \\___| \\___| \\__, | \\___||_| \\___|    |_/\\____/  \\___||_||_|  \r\n"
						+ "                                                             __/ |                                           \r\n"
						+ "                                                            |___/                  ");

		System.out.println(
				"\n-----------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
		System.out.println(
				"\n-------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
		if (peso >= 50) {
			System.out.println("\nPESO EXCEDEU OS 50KG, A COLETA DO MATERIAL SERÁ FEITA NA SUA RESIDÊNCIA\n");
			System.out.println(
					"\n======================================================================================================================================================================");
			System.out.println("INFORME O SEU ENDEREÇO: ");
			endereco = scan.nextLine();
			endereco = scan.nextLine();

			enderecoPessoa = endereco;
		}

		System.out.println(
				"\n===========================================================================================================================================================================\n");
		System.out.println(
				"\n---------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
		System.out.println(
				"\n---------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
		System.out.println(
				"                                        ______                           _          ___  _____        _   __ \r\n"
						+ "                                        | ___ \\                         | |        /   |/  ___|      | | / _|\r\n"
						+ "                                        | |_/ /  ___   ___  _   _   ___ | |  ___  / /| |\\ `--.   ___ | || |_ \r\n"
						+ "                                        |    /  / _ \\ / __|| | | | / __|| | / _ \\/ /_| | `--. \\ / _ \\| ||  _|\r\n"
						+ "                                        | |\\ \\ |  __/| (__ | |_| || (__ | ||  __/\\___  |/\\__/ /|  __/| || |  \r\n"
						+ "                                        \\_| \\_| \\___| \\___| \\__, | \\___||_| \\___|    |_/\\____/  \\___||_||_|  \r\n"
						+ "                                                             __/ |                                           \r\n"
						+ "                                                            |___/                  ");

		System.out.println(
				"\n---------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
		System.out.println(
				"\n---------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");

		System.out.println("\nTOTAL DE PONTOS OBTIDOS FOI DE: " + totalPontos);
		System.out.println(
				"===============================================================================================================================================================================");
		if (totalPontos >= 1000) {
			System.out.println("ESCOLHA O SEU PRÊMIO\n");
			premios[0] = "";
			premios[1] = "PATINS";
			premios[2] = "BRINQUEDO CASA";
			premios[3] = "LUSTRE";
			premios[4] = "BIKE";

			for (int i = 1; i < premios.length; i++) {
				System.out.println("\n" +i + "º " + premios[i]);
			}
			System.out.println(
					"===========================================================================================================================================================================");
			premioEscolhido = scan.nextInt();
			System.out.println("\n" + premios[premioEscolhido]);
		}
		if (totalPontos < 999 && totalPontos >= 750) {
			System.out.println("ESCOLHA O SEU PRÊMIO");
			premios[0] = "";
			premios[1] = "PATINS";
			premios[2] = "BRINQUEDO CASA";
			premios[3] = "LUSTRE";
			premios[4] = "BIKE";

			for (int i = 1; i < premios.length; i++) {
				System.out.println("\n" + i + "º " + premios[i]);
			}
			System.out.println(
					"===========================================================================================================================================================================");
			System.out.println(premios[premioEscolhido]);
			premioEscolhido = scan.nextInt();
		}
		if (totalPontos < 750 && totalPontos >= 500) {
			System.out.println("ESCOLHA O SEU PRÊMIO");
			premios[0] = "";
			premios[1] = "FAQUEIRO";
			premios[2] = "FICHÁRIO";
			premios[3] = "VASO DECORATIVO";
			premios[4] = "GUARDA-CHUVA";

			for (int i = 1; i < premios.length; i++) {
				System.out.println("\n" +i + "º " + premios[i]);
			}
			System.out.println(
					"============================================================================================================================================================================");
			premioEscolhido = scan.nextInt();
			System.out.println("\n" + premios[premioEscolhido]);
		}
		if (totalPontos < 500 && totalPontos >= 250) {
			System.out.println("ESCOLHA O SEU PRÊMIO");
			premios[0] = "";
			premios[1] = "PORTA-LÁPIS";
			premios[2] = "AGENDA";
			premios[3] = "PORTA-RETRATO";
			premios[4] = "CAMISETA";

			for (int i = 1; i < premios.length; i++) {
				System.out.println("\n" +i + "º " + premios[i]);
			}
			System.out.println(
					"=============================================================================================================================================================================");
			premioEscolhido = scan.nextInt();
			System.out.println("\n" + premios[premioEscolhido]);
		}
		
		System.out.println(
				"\n\n\n");
		System.out.println(
				"\n--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
		System.out.println(
				"                                        ______                           _          ___  _____        _   __ \r\n"
						+ "                                        | ___ \\                         | |        /   |/  ___|      | | / _|\r\n"
						+ "                                        | |_/ /  ___   ___  _   _   ___ | |  ___  / /| |\\ `--.   ___ | || |_ \r\n"
						+ "                                        |    /  / _ \\ / __|| | | | / __|| | / _ \\/ /_| | `--. \\ / _ \\| ||  _|\r\n"
						+ "                                        | |\\ \\ |  __/| (__ | |_| || (__ | ||  __/\\___  |/\\__/ /|  __/| || |  \r\n"
						+ "                                        \\_| \\_| \\___| \\___| \\__, | \\___||_| \\___|    |_/\\____/  \\___||_||_|  \r\n"
						+ "                                                             __/ |                                           \r\n"
						+ "                                                            |___/                  ");

		System.out.println(
				"\n--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
		System.out.println(
				"\n********************************************************************************************************************************************************************************\n");

		if (totalPontos < 250) {
			System.out.println("SUA PONTUAÇÃO AINDA NÃO É SUFICIENTE PARA RETIRARA DE UMA PREMIAÇÃO!");
		} else {
			System.out.printf("\n" + nomeCliente.toUpperCase() + " PARABÉNS! O PRÊMIO ESCOLHIDO FOI: "
					+ premios[premioEscolhido].toString());
		}
		if (peso >= 50) {
			System.out.println("\nIREMOS RETIRAR OS MATERIAIS NO SEU ENDEREÇO:  " + endereco.toUpperCase()
					+ ", DENTRO DOS PRÓXIMOS 7 DIAS!");

		} else {
			System.out.println("\nPOR FAVOR, DIRECIONE-SE A NOSSA UNIDADE MAIS PRÓXIMA, PARA A ENTREGA DO MATERIAL!");
		}
		
		scan.close();
	}

}
