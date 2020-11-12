import java.util.Scanner;
public class Uri1037{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

 Float VALOR ;

 VALOR = teclado.nextFloat();

// processamento
if (VALOR >= 0 && VALOR <=25){
            System.out.println("Intervalo (0,25]");
        }
        else if (VALOR > 25 && VALOR <=50){
            System.out.println("Intervalo (25,50]");
        }
        else if (VALOR > 50 && VALOR <=75){
            System.out.println("Intervalo (50,75]");
        }
        else if (VALOR >75  && VALOR <=100){
            System.out.println("Intervalo (50,75]");
        }
        else {
             System.out.println("Fora do Intervalo");
         }
    }   
}          