package entendendometodosjava.sobrecargaeretornos;

public class Main {
    public static void main(String[] args) {
        //Chamada dos métodos e impressões de retorno para verificar sobrecarga

        System.out.println("A área do quadrado é: " + Quadrilatero.calcularArea(4));

        double areaRetangulo = Quadrilatero.calcularArea(4d,5d);
        System.out.println("Área do retângulo: " + areaRetangulo);

        Quadrilatero.calcularArea(4,5,6);
        Quadrilatero.calcularArea(4f,5f);

        }
    }

