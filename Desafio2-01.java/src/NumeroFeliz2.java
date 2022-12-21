import java.util.*;

public class NumeroFeliz2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int quantDigito;
        int soma = 0;
        int X = 0;
        quantDigito = (int) Math.floor(Math.log10(n) + 1);
        int quantDigitoFinal = quantDigito - 1;
        boolean flag = true;

        while(flag) {
            for (int i = quantDigitoFinal; i > 0; i--) {
                int a = (int) Math.pow(10, (i));
                int b = (int) Math.pow(10, i + 1);
                X = (n - (X * b)) / a;
                int c = (int) Math.pow(X, 2);
                soma += c;
                //System.out.println(soma);
                //if (soma == 1) System.out.println(true);
                //else flag = false;
                n = soma;
            }
            if(soma == 1){ System.out.println(true);
            flag = false;}
            if (soma != 1){
                System.out.println(false);
                flag = false;
            }
        }
            //TODO: Desenvolva um algoritmo que retorne se o número é feliz ou não
    }
}

