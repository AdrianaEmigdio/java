import java.util.Scanner;
public class Uri1060{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float numero ;
        int qtdepositivos=0;
                            
        //processamento como contar ate 6 

        for (int cont = 1; cont <=6;cont++){
             numero = teclado.nextFloat();
               if (numero > 0){
                qtdepositivos++;
               }
        }
        System.out.println(qtdepositivos+" valores positivos");             
    }
}