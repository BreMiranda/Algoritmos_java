package Aula3;

import java.util.Scanner;


public class ExercicioLogin {

    public static void main(String[] args) {
        // comece o código aqui
        Scanner scan = new Scanner (System.in);
        
        //recebendo dados
        System.out.println("Username: ");
        String user = scan.nextLine();
        
        System.out.println("Senha:");
        String senha = scan.nextLine();
     
        //conferindo se os dados batem
        if (senha.equals("12345")){
        System.out.println("Acesso concedido");
    } else{
                System.out.println(" você não tem acesso");
                }
    }
     

}
