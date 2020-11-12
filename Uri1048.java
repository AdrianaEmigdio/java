import java.util.Scanner;
public class Uri1048{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

 Double SALARIO, NSALARIO, REAJUSTE ;

    SALARIO = teclado.nextDouble();

// processamento
if (SALARIO >= 0 && SALARIO <=400){
            NSALARIO = SALARIO * 1.5;
            REAJUSTE = NSALARIO - SALARIO ;
            System.out.printf("Novo Salario: %.2f\n",NSALARIO);
            System.out.printf("Reajuste Ganho:%.2f\n",REAJUSTE);
            System.out.println("Em percentual: 15%");
        }
        else if (SALARIO >= 400.01 && SALARIO <=800.00){
            NSALARIO = SALARIO * 1.2;
            REAJUSTE = NSALARIO - SALARIO ;
            System.out.printf("Novo Salario: %.2f\n",NSALARIO);
            System.out.printf("Reajuste Ganho: %.2f\n",REAJUSTE);
            System.out.println("Em percentual: 12%");
        }
        else if (SALARIO >= 800.01 && SALARIO <=1200.00){
            NSALARIO = SALARIO * 1.10;
            REAJUSTE = NSALARIO - SALARIO ;
            System.out.printf("Novo Salario: %.2f\n",NSALARIO);
            System.out.printf("Reajuste Ganho: %.2f\n",REAJUSTE);
            System.out.println("Em percentual: 10%");
        }
        else if (SALARIO >= 1200.01 && SALARIO <=2000.00){
            NSALARIO = SALARIO * 1.07;
            REAJUSTE = NSALARIO - SALARIO ;
            System.out.printf("Novo Salario: %.2f\n",NSALARIO);
            System.out.printf("Reajuste Ganho: %.2f\n",REAJUSTE);
            System.out.println("Em percentual: 7%");
        }    
        else if (SALARIO >= 2000) {
            NSALARIO = SALARIO * 1.04;
            REAJUSTE = NSALARIO - SALARIO ;
            System.out.printf("Novo Salario: %.2f\n",SALARIO);
            System.out.printf("Reajuste Ganho: %.2f\n",REAJUSTE);
            System.out.println("Em percentual: 4%");
        } 
    }
}   