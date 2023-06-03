package Aula8;

import java.util.Arrays;
import java.util.Scanner;

public class Aquecimento2 {

    public static void main(String[] args) {
        // comece o código aqui
        Scanner sc = new Scanner(System.in);

        int[] num = new int[10];
        int[] inverso = new int[10];

        for (int i = 0; i < num.length; i++) {
            System.out.println("digite um numero");
            num[i] = sc.nextInt();
          //  inverso[i] = num[i]--;
        }
        for (int i = 0; i <inverso.length; i++) {
            inverso[i] = num[9-i];
        }
        
        for(int i =0; i<num.length;i++){
        if(num[i]==inverso[i]){
            System.out.println(i+" ");}
        }
        
        System.out.println("a ordem conforme foi digitado " + Arrays.toString(num));
        System.out.println("a ordem inversa da digitada " + Arrays.toString(inverso));

    }

}
