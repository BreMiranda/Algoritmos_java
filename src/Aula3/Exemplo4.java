package Aula3;

public class Exemplo4 {

    public static void main(String[] args) {
        // comece o código aqui
        int idade = 1;
        String nome = "Maria";

        if (idade >= 18) {
            System.out.println("Você é maior de 18 anos, pode acessar o site");
        } else if (nome.equals("Maria")) {
            System.out.println("Seu nome é " + nome + " e pode acessar o site");
        } else {
            System.out.println("Você não pode acessar o site");
        }
    }
}
