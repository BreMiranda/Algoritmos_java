package Aula7;

public class ExemploCalendario {

    public static void main(String[] args) {
        // comece o c�digo aqui
        String[] meses = {"janeiro", "fevereiro", "mar�o", "abril", "maio", "junho", "julho", "agosto", "Setembro", "outubro", "novembro", "dezembro"};

        int[] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i = 0; i < meses.length; i++) {
            System.out.println("O m�s de " + meses[i] + " tem " + dias[i] + " dias");
        }

    }

}
