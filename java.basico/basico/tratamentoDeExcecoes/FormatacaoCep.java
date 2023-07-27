package controledefluxos.tratamentodeexcecoes;

import java.util.Scanner;

public class FormatacaoCep {
        public static void main(String[] args) throws CepInvalidException {
            try {
                //Retorna o cep formatado a partir da solicitação do cep
                System.out.println("O cep formatado é: " + formatarCep(solicitarCep()));
            } catch (CepInvalidException e) {
                //Trata a exceção informando o "erro" e retorna o cep formatado a patir da solicitação do cep.
                System.out.println("O cep deve conter 8 digitos.");
                System.out.println("O cep formatado é: " + formatarCep(solicitarCep()));
            }
        }
        public static String formatarCep (String cep) throws CepInvalidException{
            // Verifica a condição e lançar a exceção
            if (cep.length() != 8) {
                throw new CepInvalidException();
            }
            //Concatena os primeiros 5 digitos do cep com o hífen e os três últimos digitos (cep formatado)
            return cep.substring(0, 5).concat("-").concat(cep.substring(5,8));
        }
        public static String solicitarCep () {
            // Solicita ao usuário que digite um cep para ser formatado
            Scanner sc = new Scanner(System.in);
            System.out.println("Por favor, digite o cep que deseja formatar:");
            return sc.nextLine();
        }
}

