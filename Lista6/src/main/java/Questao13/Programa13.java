package Questao13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa13 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Eu sei dividir");

        while (true) {
            try {

                System.out.println("Informe o primeiro valor");
                int x = teclado.nextInt();
                System.out.println("Informe o segundo valor");
                int y = teclado.nextInt();
                double r = x / y;
                System.out.println("O resultado da soma é:" + r);

                break;

            } catch (ArithmeticException e) {
                System.out.println("<ERROR> Não é possivel divisões por 0(zero)");
            } catch (Exception e) {
                System.out.println("<ERROR> por favor, digite um inteiro");
            }
        }
    }
}
