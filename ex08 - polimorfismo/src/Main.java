//Criar uma classe "Impressora" com um metodo imprimir().
//Criar versões sobrecarregadas para imprimir String, int, e double.
//Criar um main() para testar as diferentes chamadas do metodo.

public class Main {
    public static void main(String[] args) {
        Impressora novaImpressora = new Impressora();
        novaImpressora.imprimir("Valor 1", "Valor 2");
        novaImpressora.imprimir(10,20);
        novaImpressora.imprimir(15.50,59.80);
    }
}