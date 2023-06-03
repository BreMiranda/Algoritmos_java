/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmo2;

public class Exemplo3 {

   
    public static void main(String[] args) {
        System.out.println("pula uma linha");
        System.out.print("não pula uma linha");   
        System.out.println("Viu só?");
        
        System.out.println("\n\nTeste pular\n uma linha");
        System.out.println("\\Meu nome é \"Brenda\"");
        
        String nome = "Brenda";
        int idade = 21;
        System.out.printf("Aqui vai a minha String %s e tenho %d \n",nome, idade);//o %s puxa a string que definimos acima e o %d puxa o int acima
        
        //atividade usando o prinntf e concatenando
        
        String faculdade = "FACENS";
        int numSemestres = 5;
        System.out.printf("Estudo na %s que e tem um curso com a duração de %d semestres\n", faculdade, numSemestres ); //usando as porcentagens
        System.out.println("Estudo na " +faculdade+ " que tem um curso com a duração de " +numSemestres+" semestres"); //usando a concatenação
        
    }
    
}
