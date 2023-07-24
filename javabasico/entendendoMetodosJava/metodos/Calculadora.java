package entendendometodosjava.metodos;

public class Calculadora {

    //Definição do método para somar dois números do tipo double
    public static void somarDoisNumeros (double numero1, double numero2){
        double resultado = numero1 + numero2;
        System.out.println("A soma dos dois números é: " + resultado);
    }
    //Definição do método para subtrair dois números do tipo double
    public static void subtrairDoisNumeros (double numero1, double numero2){
        double resultado = numero1 - numero2;
        System.out.println("A subtração dos dois números é: " + resultado);
    }
    //Definição do método para multiplicar dois números do tipo double
    public static void multiplicarDoisNumeros (double numero1, double numero2){
        double resultado = numero1 * numero2;
        System.out.println("A multiplicação dos dois números é: " + resultado);
    }
    //Definição do método para diviir dois números do tipo double
    public static void dividirDoisNumeros (double numero1, double numero2){
        double resultado = numero1 / numero2;
        System.out.println("A divisão dos dois números é: " + resultado);
    }
}
