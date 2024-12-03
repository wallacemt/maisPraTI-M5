import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /*
    *Escreva um programa que
    leia uma frase e conte o número de palavras nela. Considere que as
    palavras estão separadas por espaços em branco.
    * */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();
        String[] arrFrase = frase.split(" ");
        int cont = 0;
        for(int i = 0; i < arrFrase.length; i++){
            cont++;
        }

        System.out.println("O numero de palavras é: " + cont);

    }
}