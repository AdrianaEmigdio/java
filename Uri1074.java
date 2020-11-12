import java.util.Scanner;
public class Uri1074{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int qtde ;
        int qtdepares = 0 ;
        int qtdeimpares = 0;
        int qtdepositivos = 0 ;
        int qtdenegativos = 0;
         qtde = teclado.nextInt();

        //processamento como contar ate 4 

        for (int cont = 1; cont <=qtde;cont++){
             numero = teclado.nextInt();
               if (numero == 0){
                    System.out.println(" NULL");
               }
               else if (numero % 2 == && num > 0){
                    System.out.println(" EVEN POSITIVE");
               }
               else if (numero % 2 == && num < 0){
                    System.out.println(" EVEN NEGATIVE");
               }
               else if (numero % 2 != 0  && num > 0){
                    System.out.println(" ODD POSITIVE");
               }
               else {
                    System.out.println(" ODD NEGATIVE");
               }
  
        
    }
}