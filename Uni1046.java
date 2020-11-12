import java.util.Scanner;
public class Uni1046{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int H1, H2, Duracao ;
        H1 = teclado.nextInt();
        H2 = teclado.nextInt();
                    
        //processamento
        Duracao = H2 - H1;

        if (Duracao <= 0){
                Duracao = Duracao + 24;
        }
        System.out.println("O JOGO DUROU " +Duracao + " HORA(S)");        
         
    }
}