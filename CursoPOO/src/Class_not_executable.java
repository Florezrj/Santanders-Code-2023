import Animais.cachorro;

public class Class_not_executable{
    public static void main(String[] args) {

        // Constroi o objeto
        cachorro cachorro1 = new cachorro("Dobby", "Marrom", 20, 5, 2.5, "Neutro");
        System.out.println(cachorro1.getNumeroDeCachorros());
        cachorro cachorro2 = new cachorro("Monkey", "Cinza", 30, 8, 5.5, "Neutro");
        System.out.println(cachorro2.getNumeroDeCachorros());
        System.out.println(cachorro1.getNumeroDeCachorros());

//         seta os atributos
//        cachorro1.setNome("Dobby");
//        cachorro1.setCor("Marrom");
//        cachorro1.setAltura(20);
//        cachorro1.setTamanhoDoRabo(5);
//        cachorro1.setPeso(2.5);



        // Chama os metodos

        System.out.println("O " + cachorro1.getNome() + " buscou pegou a " + cachorro1.buscarBolinha());

        System.out.println("O Dobby está " + cachorro1.interagir("carinho"));
        System.out.println(cachorro2.getNome() + " está " + cachorro2.interagir(("mandouIrDormir")));

        System.out.println(cachorro1.toString());
        System.out.println(cachorro2.toString());
    }

}

