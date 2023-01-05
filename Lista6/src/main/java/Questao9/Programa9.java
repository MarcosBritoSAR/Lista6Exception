package Questao9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa9{
    public static void main(String[] args) {
        
        int[] x = new int[10];
        try{
            for (int i = 0; i < x.length; i++) {       
                x[i] = i;
            }
            System.out.println("-------Vetor-------");
            
            for (int i = 0; i <= x.length; i++) {
                System.out.println(x[i]);
            }
         
        } catch (InputMismatchException e) {
            System.out.println("O valor deve ser inteiro:");
            System.out.println(e);
        } finally {
            System.out.println("Encerrar Programa");
        }
    }
}
