import java.util.*;  

public class PedraPapelTesoura {  
    public static void main(String[] args){  

    final Scanner leitor = new Scanner(System.in);

    int jogadaJogador = leitor.nextInt();  
    int jogadaInimigo = leitor.nextInt();  

   switch(jogadaJogador){
      case(1):
          switch(jogadaInimigo) {
            case(1): 
              System.out.println("Empatou");
              break;
            case(2): 
              System.out.println("Perdeu");
              break;
            case(3): 
              System.out.println("Ganhou");
              break;
          default: System.out.println("-");
          }
        break;
      case(2):
        switch(jogadaInimigo) {
          case(1): 
            System.out.println("Empatou");
            break;
          case(2): 
            System.out.println("Perdeu");
            break;
          case(3): 
            System.out.println("Ganhou");
            break;
        default: System.out.println("-");
        }
      break;
      case(3):
        switch(jogadaInimigo){
          case(1): 
            System.out.println("Perdeu");
            break;
          case(2): 
            System.out.println("Ganhou");
            break;
          case(3): 
            System.out.println("Empatou");
            break;
        default: System.out.println("-");
        }
      break;
        
    }
  }
}

