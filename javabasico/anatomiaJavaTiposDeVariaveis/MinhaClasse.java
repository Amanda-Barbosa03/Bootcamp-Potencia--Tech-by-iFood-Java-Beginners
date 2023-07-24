package javabasico.anatomiajavaetiposvariaveis;

public class MinhaClasse {

    public static void main(String[] args) {
        //Definição das variáveis com seus tipos
        byte idade = 24;
        short anoNacimento = 1998;
        int mesNascimento = 8;
        double pi = 3.14;
        float altura = 1.57F;

        String primeiroNome = "Amanda";

        String sobrenome = "Bonholi Barbosa";

        //Assinatuda/chamada do método
        String nomeCompleto = nomeCompleto(primeiroNome, sobrenome);

        //Impressão do resultado do método
        System.out.println("O resultado do método é: " + nomeCompleto);

        //Impressão das variáveis definidas
        System.out.println("Olá, sou a " + nomeCompleto + "." + " Tenho " + idade + " anos.");
        System.out.println("Nasci no mês " + mesNascimento + " do ano de " + anoNacimento + "." );
        System.out.println("Minha altura é " + altura + ".");
        System.out.println("Uma última curiosidade é que meu número favorito é o pi, " + pi + ".");

    }

    //Criação do método
    public static String nomeCompleto (String primeiroNome, String sobrenome) {

        return primeiroNome.concat(" ").concat(sobrenome);
    }
}
