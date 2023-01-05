package Questao8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa8 {
    //Ave maria professor, pelo amor de deus. Eu ja devo ter feito ja um milhão de 
    //código pra calcular IMC. Na sua aula, de edina, danilo, nas aulas do youtube, na 
    //udemy. Eu lhe imploro até por nossa senhora. Deixe essa coisa horrorosa de chata
    //pra lá. Que seja o ultimo IMC que eu faça na vida!

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double tam;
        double peso;

        try {
            System.out.println("Informe sua altura");
            tam = scan.nextDouble();
            
            if(tam == 0){
                throw new ArithmeticException();
            }
            System.out.println("Informe seu peso");
            peso = scan.nextDouble();

            System.out.println("Seu IMC é de:" + (peso / Math.pow(tam, 2)));

        } catch (InputMismatchException e) {
            System.out.println("<ERROR> Entrada de dados inválidas");
        } catch (ArithmeticException e) {
            System.out.println("<ERROR> Não é possivel fazer divisão por 0(zero)");
        }

    }
}
