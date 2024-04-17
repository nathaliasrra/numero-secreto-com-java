import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(20);
        int tentativas = 1;
        int numeroEscolhido = -1;

        while(numeroEscolhido != numeroAleatorio) {

            System.out.println("Escolha um número entre 0 e 20");
            numeroEscolhido = entrada.nextInt();

            if (numeroEscolhido == numeroAleatorio) {
                String palavraTentativa = tentativas > 1 ? "tentativas" : "tentativa";
                System.out.println(
                        "Você adivinhou o número aleatório com " + tentativas + " " + palavraTentativa + "!");
                break;
            } else {
                if(numeroEscolhido > numeroAleatorio) {
                    System.out.println("O número aleatório é menor que " + numeroEscolhido);
                } else {
                    System.out.println("O número aleatório é maior que " + numeroEscolhido);
                }
            }
            tentativas++;

        }

    }
}