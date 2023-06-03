package Aula3;


public class Variaveis {

    public static void main(String[] args) {
        // comece o código aqui
        //proposta do exercicio, dar 2 valores e inverter eles sem cálculos matemáticos;
        int x = 5;
        int y = 3;
        int temp;//posso declarar uma variavel sem atribuir valor para ela
        //mostrando na tela os valores
        System.out.println("o valor de x é igual "+x+"\n e o valor de y é "+y);
        //trocando o valor de todas as variaveis
        temp = x;
        x = y;
        y = temp;
        //imprimindo na tela os valores trocados
        System.out.println("o valor de x é igual: "+x+ "\n e o valor de y é:"+y);
      
    }

}
