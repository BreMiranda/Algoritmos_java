package Prova;

import java.util.Arrays;
import java.util.Scanner;

public class prova1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] itens = new String[10];
        itens[0]="caixa"; itens[1]="cadeira"; itens[2]="caderno"; itens[3]="mouse"; itens[4]="mesa";
        int opcao=0, indice=0;
        String produto;

        System.out.println("BEM VINDOS AO ESTOQUE!!!");
        System.out.println("ESTOQUE ATUAL " + Arrays.toString(itens));

        for (int i = 5; i <= 10; i++) {
            System.out.println();
            System.out.print("sair do estoque[0], adicionar item[1], remover item[2], exibir inventário[3]: ");
            opcao = sc.nextInt();
            if (opcao == 0){
                System.out.println("ESTOQUE FECHADO!");
                break;
            }
            while (opcao != 0) {
                switch (opcao) {
                    case 1:
                        System.out.print("Qual produto a mais vai ser adicionado? ");
                        produto = sc.nextLine();
                        itens[i] = sc.nextLine();
                        System.out.print("ITEM ADICIONADO: ");
                        System.out.println(itens[i]);
                        System.out.println("NOVO ESTOQUE : " + Arrays.toString(itens));
                        opcao = 0;
                    break;
                    case 2:
                        System.out.print("Qual o indice do produto que vai ser removido? ");
                        indice = sc.nextInt();
                        itens[indice] = null;
                        System.out.println("NOVO ESTOQUE : " + Arrays.toString(itens));
                        opcao = 0;
                    break;
                    case 3:
                        System.out.print("EXIBINDO ESTOQUE FINAL: ");
                        System.out.println(" " + Arrays.toString(itens));
                        opcao == 0;
                    break;
                }

            }
        }

    }
}
