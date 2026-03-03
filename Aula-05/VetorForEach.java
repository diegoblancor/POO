
// Vetor multidimensional (matriz) com for-each

public class Matriz {
    public static void main (String [] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        
        for (int [] numero : numeros) {
        System.out.println(numero);
        }
    }
}