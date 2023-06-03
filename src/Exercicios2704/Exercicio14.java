package Exercicios2704;


public class Exercicio14 {

    public static void main(String[] args) {
        // comece o código aqui
               
            int n = 100;
                int primeiro = 0;
                int segundo = 1;
                int proximo;

                System.out.println("Série de Fibonacci ate o " + n );
                System.out.print(primeiro + " " + segundo + " ");

                for (int i = 3; i <= n; i++) {
                    proximo = primeiro + segundo;
                    System.out.print(proximo + " ");
                    primeiro = segundo;
                    segundo = proximo;
        }
    }

}
