//Criar uma classe "Forma" com metodo calcularArea().
//Criar subclasses Retangulo e Circulo, sobrescrevendo calcularArea().
//Criar um main() que instancia e exibe as áreas das formas.

public class Retangulo extends  Forma{
    double base;
    double altura;

    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        double calculoArea = base*altura;
        System.out.println("A área do Retangulo é: " + (calculoArea) + "cm²");
    }
}
