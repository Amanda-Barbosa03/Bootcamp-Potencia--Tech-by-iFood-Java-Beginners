package javabasico.metodos;

//Criação de objeto e definição de valores iniciais.
public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    //criação do método ligar.
    public void ligar(){
        ligada = true;
    }
    //criação do método desligar.
    public void desligar(){
        ligada = false;
    }

    //criação do método aumentar volume.
    public void aumentarVolume(){
        volume++;
    }

    //criação do método diminuir volume.
    public void diminuirVolume(){
        volume--;
    }

    //criação do método aumentar canal.
    public void aumentarCanal(){
        canal++;
    }

    //criação do método diminuir canal.
    public void diminuirCanal(){
        canal--;
    }

    //criação do método mudar canal.
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}
