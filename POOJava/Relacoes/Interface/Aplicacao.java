package POOJava.Relacoes.Interface;

import java.util.Scanner;

public class Aplicacao {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Bem-vindo a calculadora");
        System.out.println("Digite uma opção para calcular:");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");


        int opcaoDesejada = scan.nextInt();

        Calculadora myCalculadora = new Calculadora();

        if (opcaoDesejada == 1) {
            System.out.println("Você escolheu somar!");
            myCalculadora.Somar();
        } else if (opcaoDesejada == 2) {
            System.out.println("Você escolheu subtrair!");
            myCalculadora.Subtrair();
        } else if (opcaoDesejada == 3) {
            System.out.println("Você escolheu multiplicar!");
            myCalculadora.Multiplicar();
        } else if (opcaoDesejada == 4){
            System.out.println("Você escolheu dividir!");
            myCalculadora.Dividir();
        } else {
                System.out.println("Opção inválida. Reinicie a aplicação.");
            }
    }
}
