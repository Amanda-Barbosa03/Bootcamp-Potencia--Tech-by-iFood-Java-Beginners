package controledefluxos.condicionais;

public class ResultadoEscolar {

    public static void main(String[] args) {

        // Condicão encadeada (if, else if, else)
        System.out.println("Resultado impresso com uma condição encadeada");
        int notaFinal = 5;
        if (notaFinal >=7) {
            System.out.println("Aprovado");
        } else if (notaFinal >=5 && notaFinal < 7) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

         // Condicão ternária encadeada
        /*
        System.out.println("Resultado impresso com uma condição ternária encadeada");
        String resultadoAluno = notaFinal >= 7 ? "Aprovado" : notaFinal >=5 && notaFinal < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultadoAluno);
        */
    }

}
