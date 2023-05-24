import java.util.Arrays;

public class vetores {
    public static void main(String[] args) {
        String[] letras = {"A", "B", "C", "D"};
        System.out.println(Arrays.toString(letras));

        // Descobrir qual é o maior, menor e media do array
        int[] numeros = {9, 10, 12, 25, 2};
        int maior = numeros[0];
        int menor = numeros[0];
        int media = 0;
        for (int i=0; i < numeros.length; i++) {
            if (maior < numeros[i]) {
                maior = numeros[i];
            } else if (menor > numeros[i]) {
                menor = numeros[i];
            }
            media += numeros[i];
        }
        System.out.println("Maior número é: " + maior);
        System.out.println("Menor número é: " + menor);
        System.out.println("A média da array é: " + media/numeros.length);
    }
}
