import java.util.Arrays;
import java.util.Scanner;

public class DiferencaDigitos {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero = scan.nextInt();

        String numeroEmString = String.valueOf(numero);
        String[] split = numeroEmString.split("");

        int[] ints = Arrays.stream(split).mapToInt(Integer::new).toArray();
        //System.out.println(numeroEmString);
        //System.out.println(split[0]);
        //System.out.println(split[1]);
        //System.out.println(Arrays.toString(ints));
        //System.out.println(ints);
        int ProdutoDigitos = 1;
        int somaDigitos = 0;
        int resultado = 0;
        for(int i= 0;i < ints.length;i++){
            ProdutoDigitos = ProdutoDigitos * ints[i];
            somaDigitos = somaDigitos + ints[i];
            resultado = (ProdutoDigitos - somaDigitos);
        }
        System.out.println(resultado);

    }
}
