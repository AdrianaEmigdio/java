import java.util.Scanner;
public class Uri1134{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int cod ;
                   
      
        //processamento 
        do{
            cod = teclado.nextInt();
            
           if (cod == 1 ){
               alcool++ ;
            } 
            else if (cod == 2) {
                gasolina++;
            }  
            else if (cod == 3 ) {
                diesel++;
            }            
        }while (cod !=4);
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " +alcool);
        System.out.println("Gasolina: " +gasolina);
        System.out.println("Diesel: " +diesel);

    }
}           