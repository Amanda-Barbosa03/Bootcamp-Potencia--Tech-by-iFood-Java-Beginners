package POOJava.Relacoes.Heranca;

public class Aplicacao {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        // Exemplos de upcast - Instacia um Objeto de uma subclasse como Objeto de uma superclasse.
        Funcionario gerente = new Gerente();
        Funcionario faxineiro = new Faxineiro();
        Funcionario vendedor = new Vendedor();

        /* Exemplos de downcast - Instancia um Objeto de uma superclasse como Objeto de uma subclasse.
        Vendedor vendedor1 = (Vendedor) new Funcionario();
        Gerente gerente1 = (Gerente) new Funcionario(); // Lança o erro "ClassCastExcetion". */



        /* Criação de Vetor da superclasse com três objetos, sendo 1 da subclasse Faxineiro, outro da subclasse Gerente
        e outro da própria superclasse.*/
        Funcionario[] funcionarios = new Funcionario[] { new Faxineiro(), new Gerente(), new Funcionario()};

        // Exemplos de Polimorfismo por meio da Sobrescrita
        // O método sempre irá se comportar de acordo com o Objeto dele.
        for (Funcionario funcionario1 : funcionarios){
            funcionario1.metodo1();
        }

        System.out.println("");
        // Se a subclasse possuir o metodo 2, ele será sobrescrito, caso não será executado o método da superclasse.
        for (Funcionario funcionario1 : funcionarios){
            funcionario1.metodo2();
        }

        System.out.println("");

        //Exemplo de Sobrecrita pura
        Gerente gerente1 = new Gerente();
        gerente1.metodo2();


    }
}
