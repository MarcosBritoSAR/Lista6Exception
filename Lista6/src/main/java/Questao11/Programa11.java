/*
Escreva um programa para preencher valores de um vetor de inteiros com 10 posições. O usuário irá
informar os valores a serem inseridos e suas respectivas posições no array. O programa deve tratar as
exceções ArrayIndexOutOfBoundsException quando for informada uma posição inexistente do vetor e
NumberFormatException quando o valor informado não for número.
 */
package Questao11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa11 {

    public static void main(String[] args) {
        int[] num = new int[10];
        int x, l;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < num.length; i++) {
            try {
                System.out.println("Digite um numero");
                x = scan.nextInt();
                System.out.println("Informe o indicie do vetor que deseja adicionar o numero.");
                l = scan.nextInt();

                num[l] = x;

                System.out.println("Numero " + x + " adicionado no indice " + " = " + l);
            }catch(ArrayIndexOutOfBoundsException | NumberFormatException e ){
                System.out.println("<Error numero ou indice inválido");
                e.printStackTrace(); //Linha que ocorre o erro
                
            }
        }
    }
}
