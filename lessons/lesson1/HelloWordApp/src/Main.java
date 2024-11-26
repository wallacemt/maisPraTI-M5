import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Qual e o seu nome? ");
        String nome = scan.nextLine();
        System.out.println("Ola, " + nome + "! Seja em bem-vindo");

    }
}