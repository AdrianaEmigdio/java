import java.util.Scanner;
public class Uri1019{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int N, horas, minu, segu, resto;
        

        //entrada 

        N = teclado.nextInt();
        
        //processamento 

        horas = N / 3600; // 1h = 3600 segundos
        resto = N % 3600;

        minu = resto /60;
        segu = resto % 60;

        System.out.printf(horas+":"+minu+":"+segu);
        

    }
}