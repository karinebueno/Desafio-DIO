import java.util.*;
public class NumeroFeliz2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int quantDigito;
        int soma = 0;
        int x = 0,a,b,c;
        quantDigito = (int) Math.floor(Math.log10(n) + 1);
        int quantDigitoFinal = quantDigito - 1;
        boolean flag = true;


            for (int i = quantDigitoFinal; i > 0; i--) {
                a = (int) Math.pow(10, (i));
                b = (int) Math.pow(10, i + 1);
                x = (n - (x * b)) / a;
                c = (int) Math.pow(x, 2);
                soma += c;
                n = soma;
            }
            //System.out.println(soma);
            if(soma == 1) {
                System.out.println(true);

            }
            else {
                System.out.println(false);
            }
    }
            //TODO: Desenvolva um algoritmo que retorne se o número é feliz ou não
}



