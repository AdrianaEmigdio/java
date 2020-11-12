import java.util.Scanner;
public class Uri1142{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int N  ;
        int cont= 1 ;
                   
       N = teclado.nextInt();

        //processamento 
        do{
            if (cont % 4 != 0){
                System.out.print(cont+" ");
            }else {
                System.out.println("PUM");
            }  
            cont = cont + 1;
        }while (cont <= 4*N);
    }
}           