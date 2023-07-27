package entendendometodosjava.metodos;

public class Emprestimo {

    //Definição do método para obter a taxa de acordo com o número de parcelas
    public static double obterTaxa(int parcelas) {
        if (parcelas == 2) {
            return 0.30;            
        }
        else if (parcelas == 3) {
            return 0.45;
        }
        return 0;
    }
    //Definição do método para informar o valor final do emprestimo considerando as parcelas e o valor inicial
    public static void informarValorFinalEmprestimo (int valorInicial, int parcelas ){
        if (parcelas >= 4 || parcelas == 0) {
            System.out.println("Valor de parcelas inválido!");
        }

        else {
            //Utilização de um método dentro de outro método
            double valorFinalEmprestimo = valorInicial + (valorInicial * obterTaxa(parcelas));
            System.out.println("O valor final do empréstimo para " + parcelas + " parcelas é: R$ " + valorFinalEmprestimo);

        }
    }
}
