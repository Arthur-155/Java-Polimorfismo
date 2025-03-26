//Criar uma classe "Veiculo" com um metodo mover().
//Criar subclasses Carro e Bicicleta, sobrescrevendo mover().
//No main(), criar uma lista de Veiculo, inserir objetos das subclasses e chamar mover().

import java.util.Scanner;

public class Carro extends Veiculo {



    public Carro(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor que deseja acelerar (em km/h²): ");
        acelerar = scanner.nextDouble();
        System.out.println("Deseja acelerar por quanto tempo (em minutos) ?: ");
        tempo = scanner.nextInt();
    }

    @Override
    public void mover() {
        double tempoHoras = tempo/60;
        double calculandoDistancia = 0.5*acelerar*(tempoHoras*tempoHoras);
        System.out.printf("Distância movida com o carro: %.2f Km",calculandoDistancia);
    }
}
