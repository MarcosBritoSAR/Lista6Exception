/*
10. Crie um programa que receba n números e some esses números enquanto a soma não for superior a 100.
O programa deverá imprimir o valor somado (antes de atingir o número maior que 100) e deverá informar
quantos números foram somados e qual a média. Refaça seu programa utilizando as seguintes regras:
a) Utilize os tratamentos de exceção para lidar com a entrada de dados.
b) Quando a soma for superior a 100, o programa deverá gerar uma exceção criada pelo programador
com nome ExcecaoAcimaDeCem.
c) Lance essa exceção, com o uso de throws.
 */
package Questao10;

import java.util.Scanner;

public class Porgrama10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1, num2;

        System.out.println("Digite qunatas vezes deseja somar");
        int qnt = scan.nextInt();

        for (int i = 0; i < qnt; i++) {
            try {
                System.out.println("Digite o primeiro numero");
                num1 = scan.nextInt();
                System.out.println("Digite o segundo numero");
                num2 = scan.nextInt();

                if ((num1 + num2) > 100) {
                    throw new ExcecaoAcimaDeCem();
                }

                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                
            } catch (ExcecaoAcimaDeCem e) {
                System.out.println(e.toString());
            }
        }

    }
}
