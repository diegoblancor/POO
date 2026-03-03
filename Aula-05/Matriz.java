
// Vetor multidimensional (matriz)

public class Matriz {
    public static void main (String [] args) {
        int[][] matriz = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
        };
        
// Usando for tradicional
    for (int i = 0; i < 3; i++) {       //percorre as linhas
        for (int j = 0; j < 3; j++) {   //percorre as colunas 
    System.out.print(matriz[i][j] + " ");
       }
    System.out.println(); // quebra linha ao final da linha
    }
  }
}