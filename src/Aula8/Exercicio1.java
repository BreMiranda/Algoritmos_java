package Aula8;


public class Exercicio1 {

    public static void main(String[] args) {
        // comece o código aqui
        
        int matriz1 [] [] ={
            {1,2,3},
            {4,5,6},
            {7,8,9}};
        int matriz2 [][]={
            {10,20,30},
            {40,50,60},
            {70,80,90},};
        int[][] soma = new int[3][3];
        
       //realizando a soma
        for(int i =0; i<matriz1.length; i++){
            for(int j=0; j<matriz2.length; j++){
           soma [i] [j] = matriz1[i][j]+matriz2[i][j];     
            }
        }
        
        //imprimindo na tela
        System.out.println("1ª Matriz: ");
        for(int i =0; i<matriz1.length;i++){
            for(int j =0; j<matriz1[i].length; j++){
                System.out.print(matriz1[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("2ª Matriz: ");
         for(int i =0; i<matriz2.length;i++){
            for(int j =0; j<matriz2[i].length; j++){
               System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }
         System.out.println("A soma das matrizes");
         for(int i =0; i< soma.length; i++){
             for(int j =0; j<soma[i].length; j++){
                 System.out.print(soma[i][j]+" ");
             }
             System.out.println();
         }
        
    }

}
