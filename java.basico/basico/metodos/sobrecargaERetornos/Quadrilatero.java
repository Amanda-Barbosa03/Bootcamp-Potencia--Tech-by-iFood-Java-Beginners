package entendendometodosjava.sobrecargaeretornos;

public class Quadrilatero {

    //Criação de método com retorno double
    public static double calcularArea (double lado) {
        return lado * lado;
    }
    //Criação de método com retorno double
    public static double calcularArea (double base, double altura) {
        return base * altura;
    }
    //Criação de método void (sem retorno)
    public static void calcularArea (double baseMenor, double baseMaior, double altura) {
        System.out.println("A área do trapézio é: " + (baseMaior + baseMenor) * altura /2);
    }
    //Criação de método void (sem retorno)
    public static void calcularArea (float diagonal1, float diagonal2) {
        System.out.println("A área do losango é: " + (diagonal1 * diagonal2)/2);
    }
}
