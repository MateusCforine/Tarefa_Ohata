/**
 * Executa testes da classe Calculadora.
 *
 * Exibe os resultados das operações válidas
 * e testa também exceções para divisão por zero
 * e operador inválido.
 */
public class TesteCalculadora {

    /**
     * Método principal que executa os testes.
     *
     * @param args argumentos não utilizados
     */
    public static void main(String[] args) {

        /**
         * Cria uma instância da classe Calculadora
         * para realizar os testes das operações.
         */
        calculadora calc = new calculadora();

           /**
         * Testes de operações válidas.
         */
        System.out.println(calc.calcular(2, 3, "+"));
        System.out.println(calc.calcular(10, 4, "-"));
        System.out.println(calc.calcular(3, 5, "*"));
        System.out.println(calc.calcular(8, 2, "/"));

        /**
         * Teste que gera exceção por divisão por zero.
         */
        try {
            System.out.println(calc.calcular(8, 0, "/"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        /**
         * Teste que gera exceção por operador inválido.
         */
        try {
            System.out.println(calc.calcular(5, 5, "x"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
