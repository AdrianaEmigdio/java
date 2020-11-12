import java.util.Scanner;
public class ExemploIf{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float n1, p,  media;
        
        System.out.println("Digite a nota da prova = ");
        n1 = teclado.nextFloat();
        System.out.println("Digite a nota do projeto = ");
        p = teclado.nextFloat();
        media = (n1 + p)/2;

        if ( media >=6) {
            System.out.println("Parabens você passou");
        }
        else {
            System.out.println("Dessa vez nao deu! Até o ano que bem");
            System.out.println("Dessa vez nao deu! Até o ano que bem");
        }

    }   
}    