package entendendometodosjava.metodos;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("Exercício Mensagem: ");
        Saudacao.verificarSaudacao(10.28);

        System.out.println("Exercício Calculadora: ");
        Calculadora.somarDoisNumeros(15, 3);
        Calculadora.subtrairDoisNumeros(15, 3);
        Calculadora.multiplicarDoisNumeros(15, 3);
        Calculadora.dividirDoisNumeros(15, 3);

        System.out.println("Exercício Emprestimo: ");
        Emprestimo.informarValorFinalEmprestimo(1000, 3);
    }
}