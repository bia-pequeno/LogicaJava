package LogicaJava;

import java.util.Scanner;

public class Ex98{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[][] matriz = new int[3][3];
        int somaDiagonal = 0;
        
        System.out.println("Digite os elementos da matriz 3x3:");
        
        // Loop para ler os elementos da matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                
                // Verifica se o elemento est� na diagonal principal
                if (i == j) {
                    somaDiagonal += matriz[i][j];
                }
            }
        }
        
        System.out.println("Matriz digitada:");
        
        // Loop para exibir a matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Pula para a pr�xima linha ap�s cada linha da matriz
        }
        
        System.out.println("A soma dos elementos da diagonal principal �: " + somaDiagonal);
        
        scanner.close();
    }
}
