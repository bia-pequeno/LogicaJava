package LogicaJava;

import java.util.Scanner;

public class Ex92 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[5];
        
        System.out.println("Digite 5 n�meros inteiros:");
        
        // Lendo os n�meros
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("N�mero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        // Ordenando os n�meros em ordem decrescente usando o algoritmo de sele��o
        for (int i = 0; i < numeros.length - 1; i++) {
            int indiceMaior = i;
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] > numeros[indiceMaior]) {
                    indiceMaior = j;
                }
            }
            // Trocando os elementos de posi��o
            int temp = numeros[i];
            numeros[i] = numeros[indiceMaior];
            numeros[indiceMaior] = temp;
        }
        
        // Exibindo os n�meros em ordem decrescente
        System.out.println("N�meros em ordem decrescente:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
        
        scanner.close();
    }
}
