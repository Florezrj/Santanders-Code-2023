package Animais;

import org.w3c.dom.ls.LSOutput;

public class cachorro {
    //atributos
    private static int numeroDeCachorros;
    private String nome;
    private String cor;
    private int altura;
    private int tamanhoDoRabo;
    private double peso;
    private String estadoDeEspirito;

    //contrutores
    public cachorro(){}
    public cachorro(String nome, String cor, int altura, int tamanhoDoRabo, double peso, String estadoDeEspirito) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.tamanhoDoRabo = tamanhoDoRabo;
        this.peso = peso;
        this.estadoDeEspirito = estadoDeEspirito;
        numeroDeCachorros ++;
    }


    //metodos

    public int getNumeroDeCachorros(){
        return numeroDeCachorros;
    }
    public String getNome(){
        return this.nome;
    }
    public String getCor() {
        return this.cor;
    }
    public int getAltura() {
        return this.altura;
    }
    public int getTamanhoDoRabo() {
        return this.tamanhoDoRabo;
    }
    public double getPeso() {
        return this.peso;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }


    public String buscarBolinha() {
        return "Bolinha";
    }

    public String interagir(String acao){
          switch (acao) {
              case "carinho":
                  this.estadoDeEspirito = "FELIZ";
                  break;
              case "pisarNaPatinha":
                  this.estadoDeEspirito = "TRISTE";
                  break;
              case "mandouIrDormir":
                  this.estadoDeEspirito = "BRAVO";
          }
//        if (acao.equals("carinho")){
//            this.estadoDeEspirito = "FELIZ";
//        } else if (acao.equals("pisarNaPatinha")){
//            this.estadoDeEspirito = "TRISTE";
//        } else if (acao.equals("mandouIrDormir")){
//            this.estadoDeEspirito = "BRAVO";
//        }
        return estadoDeEspirito;
    }

    @Override
    public String toString() {
        return "cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
