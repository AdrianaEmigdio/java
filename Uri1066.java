import java.util.Scanner;
public class Uri1066{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int numero ;
        int qtdepares = 0 ;
        int qtdeimpares = 0;
        int qtdepositivos = 0 ;
        int qtdenegativos = 0;
                            
        //processamento como contar ate 6 

        for (int cont = 1; cont <=5;cont++){
             numero = teclado.nextInt();
               if (numero > 0){
                    qtdepositivos++;
               }
               if (numero < 0){
                    qtdenegativos++;
               }
               if (numero %2 == 0){
                   qtdepares++;
               }
               if (numero %2 != 0){
                   qtdeimpares++;
               }
        }
        System.out.println(qtdepares+" valor(es) par(es)");   
        System.out.println(qtdeimpares+" valor(es) impar(es)");  
        System.out.println(qtdepositivos+" valor(es) positivo(s)");
        System.out.println(qtdenegativos+" valor(es) negativo(s)");       
    }
}