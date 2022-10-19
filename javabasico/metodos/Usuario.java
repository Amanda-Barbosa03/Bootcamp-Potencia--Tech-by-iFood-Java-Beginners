package javabasico.metodos;

public class Usuario {

    public static void main(String[] args) throws Exception {
        //criação de novo objeto a partir da classe.
        SmartTv smartTv = new SmartTv();

        //Impressão dos status do objeto.
        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        //Chamada do método.
        smartTv.ligar();
        //Impressão do novo Status após a execução do método.
        System.out.println("Novo Status -> TV Ligada?  " + smartTv.ligada);

        ///Chamada do método.
        smartTv.mudarCanal(22);
        //Impressão do novo Status após a execução do método.
        System.out.println("Canal Atual: " + smartTv.canal);

        ///Chamada do método.
        smartTv.diminuirVolume();
        ///Chamada do método.
        smartTv.diminuirVolume();
        ///Chamada do método.
        smartTv.diminuirVolume();
        ///Chamada do método.
        smartTv.aumentarVolume();
        //Impressão do novo Status após a execução dos métodos.
        System.out.println("Volume atual?  " + smartTv.volume);


        ///Chamada do método.
        smartTv.desligar();
        //Impressão do novo Status após a execução do método.
        System.out.println("Novo Status -> TV Ligada?  " + smartTv.ligada);
    }
}
