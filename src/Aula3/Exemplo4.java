package Aula3;

public class Exemplo4 {

    public static void main(String[] args) {
        // comece o c�digo aqui
        int idade = 1;
        String nome = "Maria";

        if (idade >= 18) {
            System.out.println("Voc� � maior de 18 anos, pode acessar o site");
        } else if (nome.equals("Maria")) {
            System.out.println("Seu nome � " + nome + " e pode acessar o site");
        } else {
            System.out.println("Voc� n�o pode acessar o site");
        }
    }
}
