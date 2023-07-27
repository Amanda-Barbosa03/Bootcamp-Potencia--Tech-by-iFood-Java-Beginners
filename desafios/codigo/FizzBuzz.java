package javabasico.desafios;
import java.util.*;

public class FizzBuzz {
         public static void main(String[] args) {

             Scanner leitor = new Scanner(System.in);

             int numero = leitor.nextInt();
             String mensagem = retornarPalavra(numero);
             if (mensagem.equals("false")) {
                 System.out.println(numero);
             } else
                 System.out.println(mensagem);
         }
             // TODO: Retorne a palavra correta de acordo com o múltiplo de "num".
             // Caso o valor não seja múltiplo de 3 ou 5, exiba o número, conforme o enunciado.

         public static String retornarPalavra(int numero) {
                 if (numero % 3 == 0 && numero % 5 == 0){
                     return "FizzBuzz";
                 } else if (numero % 3 == 0) {
                     return "Fizz";
                 } else if (numero % 5 == 0){
                     return "Buzz";
                 } else
                     return "false";
         }
    }
