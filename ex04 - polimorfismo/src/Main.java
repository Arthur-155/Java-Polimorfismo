//Criar uma classe "Forma" com metodo calcularArea().
//Criar subclasses Retangulo e Circulo, sobrescrevendo calcularArea().
//Criar um main() que instancia e exibe as áreas das formas.

public class Main {
    public static void main(String[] args) {
        Retangulo novoRetangulo = new Retangulo(3,4);
        novoRetangulo.calcularArea();

        Circulo novoCirculo = new Circulo(5);
        novoCirculo.calcularArea();

    }
}