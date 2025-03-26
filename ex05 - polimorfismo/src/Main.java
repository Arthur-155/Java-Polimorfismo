//Criar uma classe "Veiculo" com um metodo mover().
//Criar subclasses Carro e Bicicleta, sobrescrevendo mover().
//No main(), criar uma lista de Veiculo, inserir objetos das subclasses e chamar mover().

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    List <Veiculo> listaDeVeiculo = new ArrayList<>();

    Carro novoCarro = new Carro();
    listaDeVeiculo.add(novoCarro);
    Bicicleta novaBicicleta = new Bicicleta();
    listaDeVeiculo.add(novaBicicleta);

    for(Veiculo veiculo : listaDeVeiculo){
        veiculo.mover();
    }


    }
}