//Criar uma classe "Veiculo" com um metodo mover().
//Criar subclasses Carro e Bicicleta, sobrescrevendo mover().
//No main(), criar uma lista de Veiculo, inserir objetos das subclasses e chamar mover().

import java.util.Scanner;

public class Bicicleta extends Veiculo{

    public Bicicleta (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da sua velocidade média: ");
        acelerar = scanner.nextDouble();
        System.out.println("Deseja acelerar por quanto tempo (em minutos) ?: ");
        tempo = scanner.nextInt();
    }

    @Override
    public void mover() {
        double tempoHoras = tempo/60;
        double distanciaPercorrida = acelerar*tempoHoras;
        System.out.printf("\nDistância movida com a bicicleta: %.2f Km", distanciaPercorrida);
    }
}
