//Criar uma classe "Funcionario" com metodo calcularSalario().
//Criar subclasses Gerente e Estagiario, sobrescrevendo calcularSalario().
//No main(), criar um array de Funcionario, inserir objetos das subclasses e chamar
//calcularSalario().

public class Main {
    public static void main(String[] args) {
        Funcionario[] funcionarios = {
                new Estagiario(1920.04),
                new Gerente(2480.50, 449.90, 42)
        };
        funcionarios[0].calcularSalario();
        funcionarios[1].calcularSalario();
    }
}