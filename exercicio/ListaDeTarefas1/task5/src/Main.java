import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /*
    * 5. Escreva um programa
    que receba duas palavras e determine se elas são anagramas (se possuem
    as mesmas letras, mas em ordem diferente). Exemplo: "amor" e "roma".
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String word_1 = sc.next();

        System.out.print("Digite  outra palavra: ");
        String word_2 = sc.next();

        if(word_1.length() != word_2.length()){
            System.out.println("As palavras não são anagramas, pois tem tamanhos diferentes");
        }else{
            char[] arr_1 = word_1.toCharArray();
            char[] arr_2 = word_2.toCharArray();

            Arrays.sort(arr_1);
            Arrays.sort(arr_2);

            if(Arrays.equals(arr_1, arr_2)){
                System.out.println("As palavras são anagramas");
            }else{
                System.out.println("As palavras não são anagramas");
            }
        }
        sc.close();
    }
}