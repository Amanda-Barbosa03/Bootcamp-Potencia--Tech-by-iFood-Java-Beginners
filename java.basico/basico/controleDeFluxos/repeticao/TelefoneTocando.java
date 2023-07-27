package controledefluxos.repeticao;

import java.util.Random;

    public class TelefoneTocando {
    // Exemplo Do While
        public static void main (String[]args){
            System.out.println("Discando...");

            do {
                //excutando repetidas vezes até alguém atender
                System.out.println("Telefone tocando");

            } while (tocando());

            System.out.println("Alô !!!");
        }

        // Verifica a condição se continua ou não tocando
        private static boolean tocando () {
            boolean atendeu = new Random().nextInt(3) == 1; //Retorna true ou false aleatoriamente
            System.out.println("Atendeu? " + atendeu);
            return !atendeu; //Nega o ato de continuar tocando
        }

    }
