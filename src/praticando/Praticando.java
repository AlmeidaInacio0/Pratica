package praticando;

import java.util.Scanner;

public class Praticando {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

            System.out.println("Informe um número");
            int num1 = scanner.nextInt();

            System.out.println("Informe outro número");
            int num2 = scanner.nextInt();

            if(num1 > num2){
                System.out.println("O maior numero é: " + num1);
            }
            else if(num1 == num2){
                System.out.println("Os numeros são iguais");
            }
            else{
                System.out.println("O maior número é: " +num2);
            }

    }
}
