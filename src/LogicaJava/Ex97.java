package LogicaJava;

import java.util.Scanner;

public class Ex97{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[][] matriz = new int[2][2];
        int soma = 0;
        
        System.out.println("Digite os elementos da matriz 2x2:");
        
        // Loop para ler os elementos da matriz
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                soma += matriz[i][j]; // Adiciona cada elemento à soma
            }
        }
        
        System.out.println("Matriz digitada:");
        
        // Loop para exibir a matriz
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Pula para a próxima linha após cada linha da matriz
        }
        
        System.out.println("A soma de todos os elementos da matriz é: " + soma);
        
        scanner.close();
    }
}

