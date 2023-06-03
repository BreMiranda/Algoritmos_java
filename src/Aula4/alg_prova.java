package Prova;

import java.util.Locale;
import java.util.Scanner;

public class alg_prova {

    // Um programa que pergunte ao gerente quantas x pessoas compraram naquele comercio no dia, e calcular
    // qual foi o faturamento diario. Ler qual produto e quantidade aquele consumidor comprou e repetir
    // a pergunta enquanto o codigo digitado for válido, e depois informar o preço da compra e pedir o metodo de pagamento
    // e clacular o novo preço com o acrescimo ou desconto, e repetir esse processo por todas as x pessoas e no final somar
    // todas as compras e imprimir na tela o faturamento do dia.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int pessoas, codigo, quantidade=0, pagamento, qntDinheiro=0, qntCredito=0, qntDebito=0;
        double cebolitos_1=4.00, ruffles_2=5.00, cocaMIni_3=2.50, brigadeiro_4=2.50, mistoQuente_5= 6.00;
        double compra1=0, compra2=0, compra3=0, compra4=0, compra5=0, compraTotal, dinheiro, credito, debito;
        double novoValor1=0, novoValor2=0, novoValor3=0, faturamentoTotal;

        System.out.println();
        System.out.println(" |  Produto     | Código |  Preço |");
        System.out.println(" | Cebolitos    |   1    |  4.00  |");
        System.out.println(" | Ruffles      |   2    |  5.00  |");
        System.out.println(" | Coca Mini    |   3    |  2.50  |");
        System.out.println(" | Brigadeiro   |   4    |  2.50  |");
        System.out.println(" | Misto Quente |   5    |  6.00  |");

        System.out.println();
        System.out.print("Quantas pessoas compraram hoje no lanchonete? ");
        pessoas = sc.nextInt();

        for(int i = 1; i <= pessoas; i++){ // estrutura _FOR_ para rodar o codigo enquanto a variavel i <= pessoas

            do {  // estrutura _DO WHILE_ para executar o bloco de comando enquanto o codigo digitado for valido, ou seja, codigo <= 5
                System.out.println();
                System.out.print("Qual o código do produto comprado pela " +i+ " pessoa? ");
                codigo = sc.nextInt();
                if (codigo <= 5) { // estrututa _IF_ que verifica se o codigo digitado é valido e corresponde a um produto, se sim, executa, se não, pula fora
                    System.out.print("Quantas unidades " +i+ "º cliente  comprou? ");
                    quantidade = sc.nextInt();
                } // a estrutura _IF_ fecha aqui


                // estrutura _IF ELSE_ para examinar cada codigo digitado e dar o preço da commpra
                if (codigo == 1) { // se o codigo digitado for 1, vai executar o comando pedido, se codigo != de 1, pula para o else if de baixo
                    compra1 = quantidade * cebolitos_1;
                } else if (codigo == 2) { // se o codigo digitado for 2, vai executar o comando pedido, se codigo != de 2, pula para o else if de baixo
                    compra2 = quantidade * ruffles_2;
                } else if (codigo == 3) { // se o codigo digitado for 3, vai executar o comando pedido, se codigo != de 3, pula para o else if de baixo
                    compra3 = quantidade * cocaMIni_3;
                } else if (codigo == 4) { // se o codigo digitado for 4, vai executar o comando pedido, se codigo != de 4, pula para o else if de baixo
                    compra4 = quantidade * brigadeiro_4;
                } else if (codigo == 5) { // se chegou aqui, significa todas as condições eram falsas e o codigo == 5, e vai executar o bloco de comando
                    compra5 = quantidade * mistoQuente_5;
                } // a estrutura _IF ELSE_ fecha aqui

            } while (codigo <= 5);  // estrutura _DO WHILE_ fecha aqui

            compraTotal = compra1 + compra2 + compra3 + compra4 + compra5;
            System.out.println("O valor da compra foi: "+String.format("%.2f", compraTotal));
            System.out.print("Qual foi a forma de pagamento selecionada (1-Dinheiro; 2-Cartão de Crédito; 3-Cartão de Débito)? ");
            pagamento = sc.nextInt();

            // estrutura _if else_ para examinar o codigo digitado e dar o novo valor com o metodo de pagamento escolhido
            // ** tudo dentro do if é o bloco de comando!
            if (pagamento == 1) { // se o codigo == 1, executa o bloco de comando, se nao, pula para o else if de baixo
              qntDinheiro++;
              dinheiro = (compraTotal * 5 / 100);
              novoValor1 = compraTotal - dinheiro;
              System.out.println("Com o metodo de pagamento selecionado, a compra ficou: R$ "+String.format("%.2f", novoValor1));
            } else if (pagamento == 2) { // se o codigo == 2, executa o bloco de comando, se nao, pula para o else if de baixo
                qntCredito++;
                credito = (compraTotal * 15 / 100);
                novoValor2 = compraTotal + credito;
                System.out.println("Com o metodo de pagamento selecionado, a compra ficou: R$ "+String.format("%.2f", novoValor2));
            } else if (pagamento == 3) { // se chegou aqui, essa é a unica condição verdadeira, entao vai executar esse bloco de comando
                qntDebito++;
                debito = (compraTotal * 5 / 100);
                novoValor3 = compraTotal - debito;
                System.out.println("Com o metodo de pagamento selecionado, a compra ficou: R$ "+String.format("%.2f", novoValor3));
            } // estrutura _IF ELSE_ fecha aqui

        } // a estrutura _for_ la do começo fecha aqui, e vai voltar la no começo, incrementar a variavel i (i++) e vai testar se i <= n,
          // se for verdadeiro, executa todos os comandos novamente ate a condição (i <= n) ser falsa, após a condição dar como falsa,
          // cai no ultimo comando (bloco de baixo) e finaliza o codigo!

        faturamentoTotal = novoValor1 + novoValor2 + novoValor3;
        System.out.println();
        System.out.println("O faturamento do dia foi: R$ " +String.format("%.2f.", faturamentoTotal));
        System.out.println("Compras pagas em dinheiro: "+qntDinheiro);
        System.out.println("Compras pagas em crédito: "+qntCredito);
        System.out.println("Compras pagas em débito: "+qntDebito);

    }
}
