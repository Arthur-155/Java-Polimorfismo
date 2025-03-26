//Criar uma classe "Forma" com metodo calcularArea().
//Criar subclasses Retangulo e Circulo, sobrescrevendo calcularArea().
//Criar um main() que instancia e exibe as áreas das formas.

public class Circulo extends Forma {
    double raio;
    double pi = 3.14;

    public Circulo(double raio){
        this.raio = raio;
        this.pi = pi;
    }

    @Override
    public void calcularArea() {
        double calculandoAreaCirculo = (raio*raio)*pi;
        System.out.println("A área do circulo é: " + calculandoAreaCirculo + "cm²");
    }
}
