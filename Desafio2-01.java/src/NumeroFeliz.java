
import java.util.*;

public class NumeroFeliz
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int somaint;
        double a = 0;
        double b = 0;
        double X_anterior = 0;
        double X = 0;
        double soma = 0;
        int n = scan.nextInt();
        String converterVariavel = Integer.toString(n);
        int quantDigito = converterVariavel.length();

        boolean flag = true;

        while (flag) {

            a = 0;
            b = 0;
            X_anterior = 0;
            X = 0;
            soma = 0;

            for (int i = quantDigito - 1; i >= 0; i--) {
                a = Math.pow(10, i);
                b = n - X_anterior * Math.pow(10, i + 1);
                System.out.println(b);
                System.out.println(a);
                // X = (b - (b % a)) / Math.pow(10, i);
                X = Math.floor(b/a);
                X_anterior = X;
                System.out.println(X);
                soma = soma + Math.pow(X, 2);
            }
            System.out.println(soma);
            somaint = (int)soma;
            n = somaint;
            converterVariavel = Integer.toString(somaint);
            quantDigito = converterVariavel.length();

            if (somaint == 1){
                flag = false;
            }
        }


    }
}




