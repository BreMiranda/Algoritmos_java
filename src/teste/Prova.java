package teste;

import java.util.Locale;
import java.util.Scanner;

public class Prova {

    // Um programa que pergunte ao gerente quantas x pessoas compraram naquele comercio no dia, e calcular
    // qual foi o faturamento diario. Ler qual produto e quantidade aquele consumidor comprou e repetir
    // a pergunta enquanto o codigo digitado for válido, e depois informar o preço da compra e pedir o metodo de pagamento
    // e clacular o novo pre�o com o acrescimo ou desconto, e repetir esse processo por todas as x pessoas e no final somar
    // todas as compras e imprimir na tela o faturamento do dia.

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int novaCompra=2, pessoas, codigo, quantidade=0, pagamento, qntDinheiro=0, qntCredito=0, qntDebito=0;
        double cebolitos=4.00, ruffles=5.00, cocaMini=2.50, brigadeiro=2.50, mistoQuente= 6.00;
        double compra=0, compraTotal=0, dinheiro, credito, debito;
        double novoValor1=0, novoValor2=0, novoValor3=0, faturamentoTotal=0;

        System.out.println();
        System.out.print("Quantas pessoas compraram hoje no lanchonete? ");
        pessoas = sc.nextInt();

        for(int i = 1; i <= pessoas; i++){ // estrutura FOR para rodar o codigo enquanto a variavel i <= pessoas
            compra = 0;
            
            do {
                System.out.println("C�digos dos produtos dispon�veis:");
                System.out.println();
                System.out.println(" |  Produto     | C�digo |  Pre�o |");
                System.out.println(" | Cebolitos    |   1    |  4.00  |");
                System.out.println(" | Ruffles      |   2    |  5.00  |");
                System.out.println(" | Coca Mini    |   3    |  2.50  |");
                System.out.println(" | Brigadeiro   |   4    |  2.50  |");
                System.out.println(" | Misto Quente |   5    |  6.00  |");                
                System.out.println();
                System.out.print("Qual o c�digo do produto comprado pela " +i+ " pessoa? ");
                codigo = sc.nextInt();
                
                if (codigo <= 5 && codigo >= 1) { // estrututa IF que verifica se o codigo digitado � valido e corresponde a um produto, se sim, executa, se n�o, pula fora
                    System.out.print("Quantas unidades o " +i+ "� cliente comprou? ");
                    quantidade = sc.nextInt();                    
                    // estrutura IF ELSE para examinar cada codigo digitado e dar o preço da commpra
                    if (codigo == 1) { // se o codigo digitado for 1, vai executar o comando pedido, se codigo != de 1, pula para o else if de baixo
                        compra += quantidade * cebolitos;
                    } else if (codigo == 2) { // se o codigo digitado for 2, vai executar o comando pedido, se codigo != de 2, pula para o else if de baixo
                        compra += quantidade * ruffles;
                    } else if (codigo == 3) { // se o codigo digitado for 3, vai executar o comando pedido, se codigo != de 3, pula para o else if de baixo
                        compra += quantidade * cocaMini;
                    } else if (codigo == 4) { // se o codigo digitado for 4, vai executar o comando pedido, se codigo != de 4, pula para o else if de baixo
                        compra += quantidade * brigadeiro;
                    } else if (codigo == 5) { // se chegou aqui, significa todas as condi��es eram falsas e o codigo == 5, e vai executar o bloco de comando
                        compra += quantidade * mistoQuente;
                    } // a estrutura IF ELSE fecha aqui                    
                    
                    System.out.println();
                    System.out.println("Deseja adicionar mais algum produto? 1-SIM | 2-N�O");
                    novaCompra = sc.nextInt();
                } else {
                    System.out.println("O c�digo digitado n�o existe, por favor, digite novamente.");
                }// a estrutura IF fecha aqui            
            
                
            } while (codigo < 1 || codigo > 5 || novaCompra == 1);
            
            compraTotal = compra;
            System.out.println("O valor da compra foi: "+String.format("%.2f", compraTotal));
            System.out.print("Qual foi a forma de pagamento selecionada (1-Dinheiro; 2-Cart�o de Cr�dito; 3-Cart�o de D�bito)? ");
            pagamento = sc.nextInt();            

            // estrutura if else para examinar o codigo digitado e dar o novo valor com o metodo de pagamento escolhido
            // ** tudo dentro do if � o bloco de comando!
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
            } else if (pagamento == 3) { // se chegou aqui, essa � a unica condi��o verdadeira, entao vai executar esse bloco de comando
                qntDebito++;
                debito = (compraTotal * 5 / 100);
                novoValor3 = compraTotal - debito;
                System.out.println("Com o metodo de pagamento selecionado, a compra ficou: R$ "+String.format("%.2f", novoValor3));
            } // estrutura IF ELSE fecha aqui

            faturamentoTotal += novoValor1 + novoValor2 + novoValor3;
        } // a estrutura for la do come�o fecha aqui, e vai voltar la no come�o, incrementar a variavel i (i++) e vai testar se i <= n,
          // se for verdadeiro, executa todos os comandos novamente ate a condi��o (i <= n) ser falsa, ap�s a condi��o dar como falsa,
          // cai no ultimo comando (bloco de baixo) e finaliza o codigo!
        
        System.out.println();
        System.out.println("O faturamento do dia foi: R$ " +String.format("%.2f.", faturamentoTotal));
        System.out.println("Compras pagas em dinheiro: "+qntDinheiro);
        System.out.println("Compras pagas no cr�dito: "+qntCredito);
        System.out.println("Compras pagas no d�bito: "+qntDebito);
����}
}
