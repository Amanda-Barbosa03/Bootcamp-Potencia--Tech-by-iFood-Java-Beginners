package POOJava.EsturutaBásica;

public class Aplicacao {
    public static void main(String[] args) {

        // Utilizando construtor Carro
        Carro carro1 = new Carro();

        //Atibuindo valores
        carro1.setCor("Preto");
        carro1.setModelo("Fiat Argo");
        carro1.setCapacidadeTanque(47);

        //Exibindo os valores dos atriutos
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque() + " litros");
        System.out.println("Valor total para encher o tanque R$ " + carro1.calcularValorTotalTanque(5.54));
        System.out.println("");

        // Utilizando a sobrecarga do Construtor Carro para criar o Objeto e ao mesmo tempo atribuir os valores
        Carro carro2 = new Carro("Azul","Jeep Compass", 60);

        //Exibindo os valores dos atributos
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque() + " litros");
        System.out.println("Valor total para encher o tanque R$ " + carro2.calcularValorTotalTanque(5.54));
    }
}
