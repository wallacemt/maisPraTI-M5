import java.util.Scanner;

public class Main {
    /*
    * Escreva um programa que peça dois números e um operador (+, -, *, /).
    * Realize a operação indicada e exiba o resultado.
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero_1 = sc.nextInt();

        System.out.print("Digite outro número: ");
        int numero_2 = sc.nextInt();

        System.out.print("Qual operação deseja fazer (+, -, *, /): ");
        String opcao = sc.next();
        int res = 0;


        switch(opcao){
            case "+":
                res  = numero_1 + numero_2;
                break;
            case "-":
                res = numero_1 - numero_2;
                break;
            case "*":
                res = numero_1 * numero_2;
                break;
            case "/":
                if(numero_2 != 0){
                    res = numero_1/numero_2;
                }else{
                    System.out.println("Divisão por zero não permitida!");
                }
                break;
            default:
                System.out.println("Digite uma opção válida!");
        }

        System.out.println("O resultado da operação é de " + numero_1 + " " + opcao + " " + numero_2 + " é: " + res);
    }
}