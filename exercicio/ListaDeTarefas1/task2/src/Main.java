import java.util.Scanner;
public class Main {
    /*Crie um programa que leia uma palavra e verifique se ela é um palíndromo
     (se pode ser lida da mesma forma de trás para frente). Ignore
     diferenças entre maiúsculas e minúsculas.
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String word = sc.next().toUpperCase();

        String invertWord = "";

        for(int i = word.length() - 1 ; i >= 0;i--) {
            invertWord += word.charAt(i);
        }
        if(word.equals(invertWord)){
            System.out.println("A palavra " + word + " é um palíndromo");
        }else{
            System.out.println("A palavra não é um palíndromo");
        }
    }
}