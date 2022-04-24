package br.uniesp.POO.Ted2;


import java.util.Scanner;

public class Ted04Array {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int menorValor = 0, maiorValor = 0, somaTotal = 0, somanumberPares = 0;

        int[] number = new int[10];

        for (int i=0; i<number.length; i++) {
            System.out.println("Coloque um número: ");
            number[i] = scanner.nextInt();
            somaTotal += number[i];

            if (number[i]%2 == 0){
                somanumberPares += number[i];
            }
            if (i == 0){
                maiorValor = number[i];
                menorValor = number[i];
            }
            if (number[i] < menorValor){
                menorValor = number[i];
            }
            else if (number[i] > maiorValor){
                maiorValor = number[i];
            }
        }
        System.out.println("O menor valor é: " +menorValor);
        System.out.println("O maior valor é: " +maiorValor);
        System.out.println("A soma dos números é: " +somaTotal);
        System.out.println("A soma dos números pares é: " +somanumberPares);

    }
}
