public class Primeiras_Variaveis {
    public static void main(String[] args) {

        // Java é uma linguagem altamente TIPADA, temos que declarar o type
        // No caso, vamos usar o tipo String

        String nome = "Bernardo";
        System.out.println("Olá, " + nome);
        // No java podemos declarar a variavel e depois atribuir algo, ou declarar e atribuir ao mesmo tempo

        int a;
        int b = 2;
        a = 3;
        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        // Se houver uma operação no java com números inteiros, OBRIGATORIAMENTE o resultado será um número inteiro
        // Podemos resolver isso utilizando na nossa expressão (tipo) para pedir que o resultado
        // seja representado por outro tipo diferente da variavel
        float divisao = (float) a / b;


        System.out.println("Soma = " + soma);
        System.out.println("Subtração = " + subtracao);
        System.out.println("Multiplicação = " + multiplicacao);
        System.out.println("Divisão = " + divisao);
    }
}

