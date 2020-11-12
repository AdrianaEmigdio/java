import java.util.Scanner;
public class Uri1065{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float numero ;
        int qtdepares=0;
                            
        //processamento como contar ate 6 

        for (int cont = 1; cont <=5;cont++){
             numero = teclado.nextFloat();
               if (numero %2 ==0 ){
                qtdepares++;
               }
        }
        System.out.println(qtdepares+" valores pares");           
    }
}