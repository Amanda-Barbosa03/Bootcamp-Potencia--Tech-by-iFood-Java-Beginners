package controledefluxos.repeticao;

import java.util.concurrent.ThreadLocalRandom;


    public class Mesada {
        // Exemplo While
        public static void main(String[] args) {

            double mesada = 50.0;

            while(mesada>0) {
                //Define um valor aleatório do doce
                double valorDoce = valorAleatorio();
                //Condição para que o programa não retorne valores negativos.
                if(valorDoce > mesada) {
                    valorDoce = mesada;
                }
                // Imprime o valor do doce adicionado no carrinho
                System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
                // Descona o valor do doce do valor da mesada e atualiza;
                mesada = mesada - valorDoce;
            }
            // Imprime o valor final da mesada
            System.out.println("Mesada:" + mesada);
            // Imprime que o "Joãozinho gastou toda a sua mesada em doces"
            System.out.println("Joãozinho gastou toda a sua mesada em doces");

        }
        // Retorna um número aleatório entre 2 e 8
        private static double valorAleatorio() {
            return ThreadLocalRandom.current().nextDouble(2, 8);
        }
    }

