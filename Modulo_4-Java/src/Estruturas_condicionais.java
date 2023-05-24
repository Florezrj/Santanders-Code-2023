public class Estruturas_condicionais {
    public static void main(String[] args) {
        // if-else

        int notas = 75;
        String graduacao;
        // Se nota do aluno for maior ou igual a 70, então aluno aprovado
        // 80 = A | 70 = B | 60 = C | 0 = D
        if (notas >= 80) {
            graduacao = "A";
        } else if (notas <= 79 && notas >= 70) {
            graduacao = "B";
        } else if (notas <= 69 && notas > 60) {
            graduacao = "C";
        } else if (notas <= 59 && notas >= 0){
            graduacao = "D";
        } else {
            graduacao = " ";
        }

        switch (graduacao) {
            case "A":
            case "B":
                System.out.println("Aluno Aprovado!");
                break;
            case "C":
            case "D":
                System.out.println("Não aprovado!");
                break;
            default:
                System.out.println("Nota INVALIDA!");
        }

    }
}
