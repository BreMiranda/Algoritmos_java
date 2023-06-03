package ExerciciosIf;

import java.util.Scanner;


public class FormaPagamento {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o valor total da compra: ");
        double valorTotal = scan.nextDouble();        
        System.out.println("Qual a forma de pagamento? dinheiro, credito ou debito");
        String formaPagamento = scan.next();
        
        double valorFinal = 0.0;
        
        if (formaPagamento.equals("dinheiro")){
            valorFinal = valorTotal - (valorTotal * 0.05); // 5% de desconto
        } else if (formaPagamento.equals("credito")) {
            valorFinal = valorTotal + (valorTotal * 0.1); // 10% de acréscimo
        } else if (formaPagamento.equals("debito")) {
            valorFinal =valorTotal - (valorTotal * 0.03); // 3% de desconto
        } else {
           System.out.println("Forma de pagamento inválida!");
        }
        
        System.out.println("Valor total: "+valorFinal);
        
         
    }

}
