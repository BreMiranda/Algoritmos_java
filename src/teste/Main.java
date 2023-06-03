package exercicio8;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char porcetagem = '%';
		int contadorM = 0, contadorF = 0, sexo = 3, idadeM = 0, idadeF = 0, contador = 0, somaIdadeF = 0,
			somaIdadeM = 0, somaIdade = 0;
		double alturaM = 0, alturaF = 0, somaAlturaM = 0, somaAlturaF = 0, somaAltura = 0, entre18e35 = 0;
		System.out.print("Quantidade de habitante: ");
		int habitantes = sc.nextInt();

		while (contador < habitantes) {
			contador++;
			System.out.print("Qual sexo do habitante #" + contador + " feminino(0), masculino(1): ");
			sexo = sc.nextInt();
			while (sexo != 0 && sexo != 1) {
				System.out.print("Comando invalido, digite novamente: ");
				sexo = sc.nextInt();
			}
			if (sexo == 0) {
				contadorF++;
				System.out.print("Digite idade do habitante #" + contador + ": ");
				idadeF = sc.nextInt();
				somaIdadeF += idadeF;
				somaIdade += idadeF;
				if (idadeF >= 18 && idadeF <= 35) {
					entre18e35++;
				}
				System.out.print("Digite a altura do habitante #" + contador + ": ");
				alturaF = sc.nextDouble();
				somaAlturaF += alturaF;
				somaAltura += alturaF;
			}
			else {
				contadorM++;
				System.out.print("Digite idade do habitante #" + contador + ": ");
				idadeM = sc.nextInt();
				somaIdadeM += idadeM;
				somaIdade += idadeM;
				if (idadeM >= 18 && idadeM <= 35) {
					entre18e35++;
				}
				System.out.print("Digite a altura do habitante #" + contador + ": ");
				alturaM = sc.nextDouble();
				somaAlturaM += alturaM;
				somaAltura += alturaM;
			}
		System.out.println();
		}
		somaIdadeM /= contadorM;
		somaIdadeF /= contadorF;
		somaIdade /= contador;
		somaAlturaM /= contadorM;
		somaAlturaF /= contadorF;
		somaAltura /= contador;
		entre18e35 = (entre18e35 / contador) * 100;
		System.out.println();
		System.out.println("Dados dos habitabtes: ");
		
		System.out.println("----------------------------------------------------------------------------");
		
		System.out.println("Mulheres: " + contadorF);
		System.out.println("Homens: " + contadorM);
		
		System.out.println("----------------------------------------------------------------------------");
		
		System.out.println("Media de Idade: ");
		System.out.println("Mulheres: " + somaIdadeF);
		System.out.println("Homens: " + somaIdadeM);
		System.out.println("Total: " + somaIdade);
		System.out.printf("Habitantes entre 18 e 35 anos: %.1f%c \n", entre18e35, porcetagem);
		
		System.out.println("----------------------------------------------------------------------------");
		
		System.out.println("Media de altura: ");
		System.out.printf("Mulheres: %.2f\n", somaAlturaF);
		System.out.printf("Homens: %.2f\n", somaAlturaM);
		System.out.printf("Total: %.2f\n", somaAltura);
		sc.close();
	}

}
