import java.util.Scanner;
public class Main{
    public static void Uri1070(String args[]){
        Scanner teclado = new Scanner(System.in);

        int x ;
                                         
        //processamento como identificar impar 
        x = teclado.nextInt();
        if (x % 2 == 0){
            x = x + 1;
        }
             for (int cont = 1; cont <= 6;cont++){
                 System.out.println(x);
                 x= x + 2;
                   
              }   
    }
}    