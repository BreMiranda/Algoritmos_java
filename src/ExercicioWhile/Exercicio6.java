package ExercicioWhile;

import java.util.Scanner;


public class Exercicio6 {

    public static void main(String[] args) {
        // comece o c�digo aqui
        //Fa�a um algoritmo que leia v�rios n�meros inteiros e calcule o somat�rio dos n�meros negativos (positivos s�o ignorados). O fim da leitura ser� indicado pelo n�mero 0
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int soma= 0;
        
        
        do{
        System.out.println("digite um n�mero");
        num = sc.nextInt();
        if(num<0){
        soma +=num;
        } else if(num>0){        
        }
           
        }while(num!=0);
        System.out.println("a soma dos n�meros apresentados � "+soma);
    }

}
