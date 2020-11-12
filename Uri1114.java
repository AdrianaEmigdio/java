import java.util.Scanner;
public class Uri1114{
    public static void Uri1070(String args[]){
        Scanner teclado = new Scanner(System.in);

        int senha ;
                                         
        //processamento 
        do{
            senha = teclado.nextInt();
            if (senha != 2002){
                System.out.println("Senha Invalida");
            }
            else{
            System.out.println("Acesso Permitido");
            }
        } While (senha != 2002)

    }  
}