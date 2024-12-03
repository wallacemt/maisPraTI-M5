import java.util.Scanner;

public class Main {
    /*
    * Implemente um programa que calcule e exiba os primeiros n números da sequência de Fibonacci.
    *  n deve ser fornecido pelo/a usuário/a.
    * */

    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ate qual sequencia de fibonacci quer calcular?: ");
        int op = sc.nextInt();
        calcFibonacci(op);
    }

    public static void calcFibonacci(int n) {
        int previous = 0;
        int current = 1;

        for (int i = 2; i < n; i++) {
            int next = previous + current;
            previous = current;
            current = next;
        }
        System.out.println("O " + n + "th valor da sequencia de Fibonacci é: " + current);
    }

}