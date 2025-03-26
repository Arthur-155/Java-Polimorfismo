//Criar uma classe "Impressora" com um metodo imprimir().
//Criar versões sobrecarregadas para imprimir String, int, e double.
//Criar um main() para testar as diferentes chamadas do metodo.

import java.util.Scanner;

public class Impressora {



    public void imprimir(String primeiroElemento, String segundoElemento){
        System.out.println("Primeiro valor: " + primeiroElemento);
        System.out.println("Segundo valor: " + segundoElemento);
    }

    public void imprimir(int primeiroElementoInteiro, int segundoElementoInteiro){
        System.out.println("Primeiro Valor: " + primeiroElementoInteiro);
        System.out.println("Segundo Valor: " + segundoElementoInteiro);
    }

    public void imprimir(double primeiroElementoDouble, double segundoElementoDouble){
        System.out.println("Primeiro valor: " + primeiroElementoDouble);
        System.out.println("Segundo valor: " + segundoElementoDouble);
    }

}
