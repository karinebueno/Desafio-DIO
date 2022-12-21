
import java.util.Scanner;

public class QuantidadeNecessaria {

    public static void main(String[] args) {
        final int SLICE = 4;
        Scanner scanner = new Scanner(System.in);
        int produto;
        double resposta;

        int T = scanner.nextInt();
        System.out.println("Entre com a quantidade de amigos: ");
        int N = scanner.nextInt();
        System.out.println("Entre com a quantidade que cada amigo quer: ");
        int X = scanner.nextInt();

        produto = N * X;
        double d = produto;
        resposta = Math.ceil(d / SLICE);
        int respostaFinal = (int) resposta;

        System.out.println(respostaFinal);

    }
}
