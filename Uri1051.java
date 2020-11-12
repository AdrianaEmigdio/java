import java.util.Scanner;
public class Uri1050{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double salario ;
        salario = teclado.nextDouble();
        if (salario <= 2000.0){
            System.out.println("Isento");
        }
        else if (salario <= 3000){
            imposto = (salario - 2000.0) * 0.08;
            System.out.printf("R$ %.2f\n",imposto)
        }
        else if (salario <= 4500.0){
            imposto = (salario - 3000.0 - 2000.0) * 0.18 + 80.0 //80.0 é o imposto da faixa entre 2000 e 3000;
            System.out.printf("R$ %.2f\n",imposto)