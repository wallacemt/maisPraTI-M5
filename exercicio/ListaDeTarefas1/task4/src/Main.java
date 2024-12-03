import java.util.Scanner;

public class Main {

    /*
    4. Crie um programa que leia um número inteiro e exiba o número invertido.
    Exemplo: se o usuário digitar 1234, o programa deve exibir 4321.
    * */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        int invertNum = 0;

        while(num != 0){
            int dig = num % 10;
            invertNum= invertNum * 10 + dig;
            num = num / 10;
        }

        System.out.println("O numero invertido é: " + invertNum);
    }
}