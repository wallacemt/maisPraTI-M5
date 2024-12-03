import java.util.Scanner;

public class Main {
    /*
    * Jogo em que o programa escolhe um número entre 1 e 50, e o/a usuário/a
    deve adivinhar. O programa informa apenas se o palpite está certo ou
    errado. O jogo termina quando o número é adivinhado.*/
    public static void main(String[] args) {
       int secreto = (int) (Math.random() * 50 + 1);
       Scanner sc = new Scanner(System.in);
       int palpite = 0;
       int tentativas = 10;
      do{
          System.out.print("Qual e o numero secreto?: ");
          palpite = sc.nextInt();

          System.out.println("__________");
          if(palpite > secreto){
              System.out.println("Errou!O Numero e menor.");
          }else if(palpite < secreto){
              System.out.println("Errou! O Numero e maior.");
          }else{
              System.out.println("Acertou o numero era: " + secreto);
          }

          if(tentativas > 0){
              System.out.println("Tentativas restantes: " + tentativas);
          }else{
              System.out.println("PERDEU! O numero era, " + secreto);
              break;
          }

          System.out.println("__________");
          tentativas--;
      }while(palpite != secreto);

    }
}