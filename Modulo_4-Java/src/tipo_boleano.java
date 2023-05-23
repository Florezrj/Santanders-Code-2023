public class tipo_boleano {
    public static void main(String[] args) {
        boolean fimDeSemana = true;
        boolean fazendoSol = true;
        boolean vamosAPraia = fazendoSol && fimDeSemana;

        // Tabela verdade
        // Operador && (AND)
        // true && true = true
        // true && false = false
        // false && true = false
        // false && false = false

        // Operador || (OR)
        // true || true = true
        // true || false = true
        // false || true = true
        // false || false = false

        System.out.println(vamosAPraia);
    }
}
