public class fuction {

    public static void main(String[] args) {
        int resultado = soma(3,2);
        System.out.println(resultado);

        String nomeUser = "Bernardo";
        saudacao(nomeUser);
    }

    public static int soma(int a, int b) {
        int soma = (a + b);
        return soma;
    }

    public static void saudacao(String nome) {
        System.out.println("Olá, " + nome);
    }
}
