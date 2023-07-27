package POOJava.Relacoes.Interface;

import java.util.Scanner;

public class Calculadora implements OperacaoMatematica {
    Scanner scanner = new Scanner(System.in);

    // Sobrescrita dos métodos
    @Override
    public void Somar() {
        System.out.println("Soma: " + (getNumeroA() + getNumeroB()));
    }

    @Override
    public void Subtrair() {
        System.out.println("Subtrair: " + (getNumeroA() - getNumeroB()));
    }

    @Override
    public void Multiplicar() {
        System.out.println("Multiplicar: " + getNumeroA() * getNumeroB());
    }

    @Override
    public void Dividir() {
        System.out.println("Soma: " + (getNumeroA() / getNumeroB()));
    }
    public double getNumeroA (){
        System.out.println("Digite o primeiro número:");
        return scanner.nextDouble();
    }

    public double getNumeroB () {
        System.out.println("Digite o segundo número:");
        return scanner.nextDouble();
    }
}


