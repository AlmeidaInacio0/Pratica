package EstruturaDeDecisao;

import java.util.Scanner;

public class EstruturaDeDecisao {

    public static void main(String[] args) {
        numeroPar();
        stringIgual();

    }


        private static void numeroPar(){
            Scanner scanner= new Scanner(System.in);
            System.out.println("Informe um numero");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                System.out.println("par");
            } else {
                System.out.println("impar");
            }
        }
        private static void stringIgual(){

            String palavra = "segunda feira";

            if(palavra.contains("segunda feira")){
                System.out.println("dia triste");
            }
            else{
                System.out.println("Dia normal");
            }
        }
    }

