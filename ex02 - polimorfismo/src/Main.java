//Criar uma classe "Calculadora" com um metodo somar().
//Criar versões sobrecarregadas de somar(), aceitando int, double e três números.
//No main(), chamar os diferentes métodos para testar.

public class Main {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        calculadora.somar(15,20);
        calculadora.somar(20,566,123);
        calculadora.somar(50.65,92.31);
        calculadora.somar(249.50,810.20,920.60);
    }
}