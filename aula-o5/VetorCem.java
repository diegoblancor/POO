
// Vetor de 100 posições, in
public class VetorCem {    
public static void main(String[] args) {
 
// Declaração do vetor com 100 posições
int[] vetor = new int[100];

vetor [0] = 3;

// Preenchimento automático usando a lógica de ímpares começando em 3

for (int i = 1; i < vetor.length; i++) {
    vetor [i] = vetor[i-1] + 2;

// Imprime cada valor para conferir
    System.out.println("Posição [" + i + "] = " + vetor[i]);

   }
 
  }
}